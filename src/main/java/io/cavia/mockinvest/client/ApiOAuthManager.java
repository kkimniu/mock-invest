package io.cavia.mockinvest.client;

import com.fasterxml.jackson.databind.JsonNode;
import io.cavia.mockinvest.domain.ApiCredential;
import io.cavia.mockinvest.domain.CredentialType;
import io.cavia.mockinvest.repository.ApiOAuthRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ApiOAuthManager {
    private final WebClient webClient;
    private final ApiOAuthRepository apiOAuthRepository;

    private String accessToken;
    private String approvalKey;
    private LocalDateTime tokenExpiresIn;
    private LocalDateTime keyExpiresIn;

    @Value("${stock-api.appkey}")
    private String appKey;

    @Value("${stock-api.appsecret}")
    private String appSecret;

    public ApiOAuthManager(WebClient webClient, ApiOAuthRepository apiOAuthRepository) {
        this.webClient = webClient;
        this.apiOAuthRepository = apiOAuthRepository;
    }


    /**
     * API 요청을 위한 액세스 토큰을 반환함.
     * 메모리 변수에 엑세스 토큰이 없으면 DB에서 받아오고,
     * 메모리나 DB에서 받아온 토큰의 만료까지 1시간 이내이거나 메모리 DB 둘다 토큰이 없다면
     * 새로운 토큰을 발급받고 DB와 메모리에 저장함.
     *
     * @return API 액세스 토큰
     */
    @Transactional
    public String getAccessToken() {
        // 토큰을 갱신해야 하는 기준 시점: 현재 시간으로부터 1시간 후 이전이면 갱신
        // 즉, 만료까지 1시간 미만으로 남았거나 이미 만료된 경우를 의미합니다.
        LocalDateTime refreshThreshold = LocalDateTime.now().plusHours(1);

        // 1. 먼저 메모리에 있는 토큰 확인
        if (this.accessToken != null && this.tokenExpiresIn != null && this.tokenExpiresIn.isAfter(refreshThreshold)) {
            // 메모리에 유효한 토큰이 있고, 만료까지 1시간 이상 남은 경우
            System.out.println("메모리의 유효한 토큰 사용. 만료 예정: " + this.tokenExpiresIn);
            return this.accessToken;
        }

        // 2. 메모리 토큰이 없거나, 만료되었거나, 곧 만료될 예정인 경우 DB 확인
        if (this.accessToken == null) {
            System.out.println("메모리에 토큰 없음. DB에서 로드 시도.");
        } else {
            System.out.println("메모리 토큰 만료 또는 만료 임박 (" + this.tokenExpiresIn + "). DB에서 로드 시도.");
        }
        Map<CredentialType, ApiCredential> map = apiOAuthRepository.findAllByCredentialOwner("0");
        ApiCredential dbCredential = map.get(CredentialType.ACCESS_TOKEN);

        if (dbCredential != null &&
                dbCredential.getExpiresIn() != null &&
                dbCredential.getExpiresIn().isAfter(refreshThreshold)) {
            // DB에 유효한 토큰이 있고, 만료까지 1시간 이상 남은 경우
            System.out.println("DB에서 유효한 토큰 로드 및 메모리 업데이트. 만료 예정: " + dbCredential.getExpiresIn());
            this.accessToken = dbCredential.getCredentialValue();
            this.tokenExpiresIn = dbCredential.getExpiresIn();
            return this.accessToken;
        }

        // 3. 메모리와 DB 모두에 유효한 토큰이 없는 경우: 새 토큰 요청
        if (dbCredential == null) {
            System.out.println("DB에도 토큰이 없습니다.");
        } else { // dbCredential은 있지만 유효하지 않은 경우
            System.out.println("DB 토큰이 만료되었거나 만료 임박 (" + (dbCredential.getExpiresIn() != null ? dbCredential.getExpiresIn() : "만료시간 정보 없음") + ").");
        }
        System.out.println("새 토큰을 요청하고 DB 및 메모리를 업데이트합니다.");

        requestAccessToken(); // 새 토큰 요청, DB 저장, 메모리 업데이트를 모두 수행하는 메서드

        return this.accessToken;
    }

    private void requestAccessToken() {
        System.out.println("Requesting new token");

        try {
            JsonNode responseNode = this.webClient.post().uri("/oauth2/tokenP")
                    .bodyValue(Map.of("grant_type", "client_credentials",
                            "appkey", appKey,
                            "appsecret", appSecret))
                    .retrieve() //
                    // 요청 보내고, 성공하면 응답 바디를 가져올 준비를 하고, 실패하면 예외를 던짐
                    .bodyToMono(JsonNode.class) // 응답을 JsonNode 객체로 변환
                    .block();

            if (responseNode != null && responseNode.has("access_token") &&
                    responseNode.has("access_token_token_expired")) {
                String newAccessToken = responseNode.get("access_token").asText(); // 타입 안전하게
                String newExpiresIn = responseNode.get("access_token_token_expired").asText();

                // 정의한 포맷터를 사용하여 문자열을 LocalDateTime 객체로 파싱합니다.
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                this.tokenExpiresIn = LocalDateTime.parse(newExpiresIn, formatter);
                this.accessToken = newAccessToken;

                apiOAuthRepository.save(new ApiCredential(
                        "0",
                        CredentialType.ACCESS_TOKEN,
                        accessToken,
                        tokenExpiresIn));
                System.out.println(tokenExpiresIn + " 에 새로운 토큰 발급 : " + newAccessToken);
            } else {
                throw new RuntimeException("Failed to refresh API token or access_token not found in response");
            }
        } catch (WebClientResponseException e) {
            System.err.println("API 호출 중 에러 발생!");
            System.err.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            System.err.println("Error Body: " + errorBody);
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("Error during token refresh: " + e.getMessage(), e);
        }
    }

    /**
     *  API 웹소켓 연결을 위한 접근키를 반환함.
     *  메모리 변수에 접근키가 없으면 DB에서 받아오고,
     *  메모리나 DB에서 받아온 접근키의 만료까지 1시간 이내이거나 메모리 DB 둘다 토큰이 없다면
     *  새로운 접근키를 발급받고 DB와 메모리에 저장함.
     *  API 문서에 따른 접근키의 만료시간은 24시간이며, 한번 연결하면 연결이 끊기기 전까지는 유효함.
     *
     * @return API 웹소켓 접근을 위한 key
     */
    @Transactional
    public String getApprovalKey() {
        // 토큰을 갱신해야 하는 기준 시점: 현재 시간으로부터 1시간 후 이전이면 갱신
        // 즉, 만료까지 1시간 미만으로 남았거나 이미 만료된 경우를 의미합니다.
        LocalDateTime refreshThreshold = LocalDateTime.now().plusHours(1);

        // 1. 먼저 메모리에 있는 토큰 확인
        if (this.approvalKey != null && this.keyExpiresIn != null && this.keyExpiresIn.isAfter(refreshThreshold)) {
            // 메모리에 유효한 토큰이 있고, 만료까지 1시간 이상 남은 경우
            System.out.println("메모리의 유효한 접근키 사용. 만료 예정: " + this.keyExpiresIn);
            return this.approvalKey;
        }

        // 2. 메모리 토큰이 없거나, 만료되었거나, 곧 만료될 예정인 경우 DB 확인
        if (this.approvalKey == null) {
            System.out.println("메모리에 접근키 없음. DB에서 로드 시도.");
        } else {
            System.out.println("메모리 접근키 만료 또는 만료 임박 (" + this.keyExpiresIn + "). DB에서 로드 시도.");
        }
        Map<CredentialType, ApiCredential> map = apiOAuthRepository.findAllByCredentialOwner("0");
        ApiCredential dbCredential = map.get(CredentialType.APPROVAL_KEY);

        if (dbCredential != null &&
                dbCredential.getExpiresIn() != null &&
                dbCredential.getExpiresIn().isAfter(refreshThreshold)) {
            // DB에 유효한 접근키이 있고, 만료까지 1시간 이상 남은 경우
            System.out.println("DB에서 유효한 접근키 로드 및 메모리 업데이트. 만료 예정: " + dbCredential.getExpiresIn());
            this.approvalKey = dbCredential.getCredentialValue();
            this.keyExpiresIn = dbCredential.getExpiresIn();
            return this.approvalKey;
        }

        // 3. 메모리와 DB 모두에 유효한 토큰이 없는 경우: 새 토큰 요청
        if (dbCredential == null) {
            System.out.println("DB에도 접근키가 없습니다.");
        } else { // dbCredential은 있지만 유효하지 않은 경우
            System.out.println("DB 접근키가 만료되었거나 만료 임박 (" + (dbCredential.getExpiresIn() != null ? dbCredential.getExpiresIn() : "만료시간 정보 없음") + ").");
        }
        System.out.println("새 접근키을 요청하고 DB 및 메모리를 업데이트합니다.");

        requestApprovalKey(); // 새 접근키 요청, DB 저장, 메모리 업데이트를 모두 수행하는 메서드

        return this.approvalKey;
    }

    private void requestApprovalKey() {
        System.out.println("Requesting new key");

        try {
            // 키 하나만 가지고 오면 되기 때문에 DTO 객체 대신 JsonNode 객체를 사용
            JsonNode responseNode = this.webClient.post()
                    .uri("/oauth2" + "/Approval")
                    .bodyValue(Map.of("grant_type", "client_credentials",
                            "appkey", appKey,
                            "secretkey", appSecret))
                    .retrieve() // 요청 보내고,
                    // 성공하면 응답 바디를 가져올 준비를 하고 실패하면 예외를 던짐
                    .bodyToMono(JsonNode.class) // 응답을 JsonNode 객체로 변환
                    .block();

            if (responseNode != null && responseNode.has("approval_key")) {
                // 타입 안전하게 텍스트로 가져옴
                this.approvalKey = responseNode.get("approval_key").asText();
                this.keyExpiresIn = LocalDateTime.now().plusHours(24);
                apiOAuthRepository.save(new ApiCredential(
                        "0",
                        CredentialType.APPROVAL_KEY,
                        this.approvalKey,
                        this.keyExpiresIn));

                System.out.println(this.keyExpiresIn + " 에 새로운 접근키 발급 : " + this.approvalKey);

            } else {
                throw new RuntimeException("Failed to refresh API key or approval_key not found in response");
            }
        } catch (WebClientResponseException e) {
            System.out.println("API 호출 중 에러 발생!");
            System.out.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            System.out.println("Error Body: " + errorBody);
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("Error during key refresh: " + e.getMessage(), e);
        }
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getAppKey() {
        return appKey;
    }


}
