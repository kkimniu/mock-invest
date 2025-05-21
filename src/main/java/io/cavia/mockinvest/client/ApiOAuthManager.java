package io.cavia.mockinvest.client;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.time.LocalDateTime;
import java.util.Map;

public class ApiOAuthManager {
    private final WebClient webClient;
    private String accessToken;
    private LocalDateTime tokenCreatedAt;
    private String approvalKey;
    private LocalDateTime keyCreatedAt;

    @Value("${stock-api.appkey}")
    private String appKey;

    @Value("${stock-api.appsecret}")
    private String appSecret;

    public ApiOAuthManager(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
            .baseUrl("https://openapi.koreainvestment.com:9443")
            .build();
    }


    /**
     * API 요청을 위한 액세스 토큰을 받아옴. 액세스 토큰은 싱글톤 방식으로 관리됨.
     * 액세스 토큰을 요청한지 6시간이 지났으면, 액세스 토큰을 외부 API에 새롭게 요청해 발급받음.
     *
     * @return API 액세스 토큰
     */
    public String getAccessToken() {
        if (accessToken == null || LocalDateTime.now().isAfter(tokenCreatedAt.plusHours(6))) {
            System.out.println("토큰이 없거나 발급한지 6시간이 경과함, 새로운 토큰 요청");
            requestAccessToken();
        }
        System.out.println(tokenCreatedAt + " 에 생성된 토큰 반환 : " + accessToken.substring(0, 10) + "...");
        return accessToken;
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

            if (responseNode != null && responseNode.has("access_token")) {
                String newAccessToken = responseNode.get("access_token").asText(); // 타입 안전하게
                // 텍스트로 가져옴
                this.accessToken = newAccessToken;
                this.tokenCreatedAt = LocalDateTime.now();
                System.out.println(tokenCreatedAt + " 에 새로운 토큰 발급 : " + newAccessToken);

            } else {
                throw new RuntimeException("Failed to refresh API token or access_token not found in response");
            }
        } catch (WebClientResponseException e) {
            System.out.println("API 호출 중 에러 발생!");
            System.out.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            System.out.println("Error Body: " + errorBody);
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("Error during token refresh: " + e.getMessage(), e);
        }
    }

    /**
     * 웹소켓 접근키 수명은 24시간임, 발급 요청 할 때마다 새로운 키가 발급됨.
     * 한 번 연결하면 세션이 종료되기 전까지는 365일 내내 유지됨.
     * 세션이 종료되었을 때만 요청하면 될 것으로 보임. 현재는 발급받은지 24시간이 지나면 새로 발급받음.
     *
     * @return API 웹소켓 접근을 위한 key
     */
    public String getApprovalKey() {
        if (approvalKey == null || LocalDateTime.now().isAfter(keyCreatedAt.plusHours(24))) {
            System.out.println("접근키가 없거나 발급한지 24시간이 경과함, 새로운 접근키 요청");
            requestApprovalKey();
        }
        System.out.println(keyCreatedAt + " 에 생성된 접근키 반환 : " + approvalKey.substring(0, 10) + "...");
        return approvalKey;
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
                String newAccessToken = responseNode.get("approval_key").asText(); // 타입 안전하게
                // 텍스트로 가져옴
                this.approvalKey = newAccessToken;
                this.keyCreatedAt = LocalDateTime.now();
                System.out.println(keyCreatedAt + " 에 새로운 접근키 발급 : " + newAccessToken);

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
