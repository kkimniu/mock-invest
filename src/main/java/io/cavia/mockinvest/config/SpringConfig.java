package io.cavia.mockinvest.config;

import io.cavia.mockinvest.repository.JpaMemberRepository;
import io.cavia.mockinvest.repository.MemberRepository;
import io.cavia.mockinvest.scrvice.MemberService;
import jakarta.persistence.EntityManager;
import io.cavia.mockinvest.client.ApiOAuthManager;
import io.cavia.mockinvest.client.RestWebClient;
import io.cavia.mockinvest.mapper.KorOrderRealTimeMapper;
import io.cavia.mockinvest.mapper.KorStockRealTimeMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class SpringConfig {

    private final EntityManager em;
    private final WebClient.Builder webClientBuilder;

    public SpringConfig(WebClient.Builder webClientBuilder, EntityManager em) {
        this.webClientBuilder = webClientBuilder;
        this.em = em;
    }

    @Bean
    public MemberService memberService(MemberRepository memberRepository) {
        return new MemberService(memberRepository);
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }

    @Bean
    public WebClient webClient() {
        return webClientBuilder
            .baseUrl("https://openapi.koreainvestment.com:9443")
            .build();
    }

    @Bean
    public RestWebClient restWebClient() {
        return new RestWebClient(webClient(), apiOAuthManager());
    }

    @Bean
    public ApiOAuthManager apiOAuthManager() {
        return new ApiOAuthManager(webClient());
    }

    @Bean
    public KorStockRealTimeMapper korStockRealTimeMapper() {
        return new KorStockRealTimeMapper();
    }

    @Bean
    public KorOrderRealTimeMapper korOrderRealTimeMapper() {
        return new KorOrderRealTimeMapper();
    }
}
