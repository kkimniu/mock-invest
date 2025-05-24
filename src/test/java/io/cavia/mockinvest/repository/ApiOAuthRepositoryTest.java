package io.cavia.mockinvest.repository;

import io.cavia.mockinvest.domain.ApiCredential;
import io.cavia.mockinvest.domain.CredentialType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootTest
@Transactional
public class ApiOAuthRepositoryTest {

    @Autowired
    ApiOAuthRepository apiOAuthRepository;

    @Test
    void saveAndFind() {

        ApiCredential token = new ApiCredential(
            "1",
            CredentialType.ACCESS_TOKEN,
            "GENERATED_ACCESS_TOKEN_VALUE_" + UUID.randomUUID(),
            LocalDateTime.now().plusHours(24));

        ApiCredential key = new ApiCredential(
            "1",
            CredentialType.APPROVAL_KEY,
            "GENERATED_ACCESS_TOKEN_VALUE_" + UUID.randomUUID(),
            LocalDateTime.now().plusHours(24));

        Map<CredentialType, ApiCredential> expectedMap = new HashMap<>();
        expectedMap.put(token.getCredentialType(), token);
        expectedMap.put(key.getCredentialType(), key);

        apiOAuthRepository.save(token);
        apiOAuthRepository.save(key);

        Map<CredentialType, ApiCredential> actualMap = apiOAuthRepository.findAllByCredentialOwner("1");
        System.out.println(actualMap.get(CredentialType.ACCESS_TOKEN));
        System.out.println(actualMap.get(CredentialType.APPROVAL_KEY));

        Assertions.assertThat(actualMap).isEqualTo(expectedMap);
    }

    @Test
    void findAllByCredentialOwner() {
        Map<CredentialType, ApiCredential> actualMap = apiOAuthRepository.findAllByCredentialOwner("1");
        System.out.println(actualMap.get(CredentialType.ACCESS_TOKEN));
    }
}
