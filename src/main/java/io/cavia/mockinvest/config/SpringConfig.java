package io.cavia.mockinvest.config;

import io.cavia.mockinvest.repository.JpaMemberRepository;
import io.cavia.mockinvest.repository.MemberRepository;
import io.cavia.mockinvest.scrvice.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final EntityManager em;
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
    @Bean
    public MemberService memberService(MemberRepository memberRepository){
        return new MemberService(memberRepository);
    }
    @Bean
    public MemberRepository memberRepository(){
        return new JpaMemberRepository(em);
    }
}
