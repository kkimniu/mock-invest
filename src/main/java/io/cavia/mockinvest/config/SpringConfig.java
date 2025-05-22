package io.cavia.mockinvest.config;


import io.cavia.mockinvest.client.ApiOAuthManager;
import io.cavia.mockinvest.client.RestWebClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class SpringConfig {

    private final WebClient.Builder webClientBuilder;

    public SpringConfig(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
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
}
