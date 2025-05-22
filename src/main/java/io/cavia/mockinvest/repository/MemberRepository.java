package io.cavia.mockinvest.repository;


import io.cavia.mockinvest.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<String> findByUserid(String userid);

    List<Member> findAll();
}
