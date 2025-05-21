package io.cavia.mockinvest.controller;

import io.cavia.mockinvest.domain.Member;
import io.cavia.mockinvest.scrvice.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /**
     * get방식으로 사용자에게 회원 가입 페이지를 보여줍니다.
     * @param model
     * @return
     */
    @GetMapping("/members/join")
    public String memberJoinForm(Model model){
        model.addAttribute("form", new MemberForm());
        return "members/memberJoinForm";
    }

    /**
     * post방식으로 - 사용자가 가입 폼을 제출하면 회원 정보를 받아서 저장하고,
     * 중복 아이디가 있으면 오류를 반환
     * @param form
     * @param model
     * @return
     */
    @PostMapping("/members/join")
    public String memberJoin(@ModelAttribute MemberForm form, Model model){
        Member member = new Member();
        member.setUserid(form.getUserid());
        member.setName(form.getName());
        member.setPassword(form.getPassword());
        member.setTel(form.getTel());
        member.setEmail(form.getEmail());
        try {
            memberService.join(member);
            return "redirect:/";
        }catch (IllegalStateException i){
            model.addAttribute("form", form); // 기존 입력값 유지
            model.addAttribute("password", ""); // 비밀번호만 공백으로 설정
            model.addAttribute("error", "이미 존재하는 회원입니다."); // 에러 메시지 추가
            return "members/memberJoinForm";
        }
    }

}
