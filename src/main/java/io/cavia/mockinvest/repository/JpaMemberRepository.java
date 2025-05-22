package io.cavia.mockinvest.repository;

import io.cavia.mockinvest.domain.Member;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {

    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    /**
     * 회원가입한 사용자 정보 저장
     */
    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    /**
     * 회원 아이디 찾는 메소드
     */
    @Override
    public Optional<String> findByUserid(String userid) {
        return em.createQuery("SELECT m.userid FROM Member m WHERE m.userid = :userid", String.class)
                .setParameter("userid", userid)
                .getResultStream()
                .findFirst();
    }

    /**
     * 모든 회원들 찾는 메소드
     *
     * @return
     */
    @Override
    public List<Member> findAll() {
        return em.createQuery("SELECT m  FROM Member m", Member.class).getResultList();
    }
}
