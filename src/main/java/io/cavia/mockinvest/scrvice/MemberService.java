package io.cavia.mockinvest.scrvice;

import io.cavia.mockinvest.domain.Member;
import io.cavia.mockinvest.repository.MemberRepository;
import jakarta.transaction.Transactional;

@Transactional
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원의 값을 받으면 중복검사 후 id값을 반환
     * @param member
     * @return
     */
    public long join(Member member){
        if(isDuplicateUserid(member)){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
        memberRepository.save(member);
        return member.getId();
    }

    /**
     * 중복된 회원의 userid가 있으면 true 없으면 false를 반환
     * @param member
     * @return
     */
    public boolean isDuplicateUserid(Member member) {
        return memberRepository.findByUserid(member.getUserid()).isPresent();
    }
}
