package com.hellospring.demo;

import com.hellospring.demo.member.Grade;
import com.hellospring.demo.member.Member;
import com.hellospring.demo.member.MemberService;
import com.hellospring.demo.member.MemberServiceImpl;
import com.hellospring.demo.order.Order;
import com.hellospring.demo.order.OrderService;
import com.hellospring.demo.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item1", 10000);

        System.out.println("order = " + order);
    }
}
