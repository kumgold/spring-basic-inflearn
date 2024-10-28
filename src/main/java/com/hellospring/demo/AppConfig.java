package com.hellospring.demo;

import com.hellospring.demo.discount.FixDiscountPolicy;
import com.hellospring.demo.member.MemberService;
import com.hellospring.demo.member.MemberServiceImpl;
import com.hellospring.demo.member.MemoryMemberRepository;
import com.hellospring.demo.order.OrderService;
import com.hellospring.demo.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
