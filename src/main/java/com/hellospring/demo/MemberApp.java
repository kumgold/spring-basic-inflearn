package com.hellospring.demo;

import com.hellospring.demo.member.Grade;
import com.hellospring.demo.member.Member;
import com.hellospring.demo.member.MemberService;
import com.hellospring.demo.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "member1", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
