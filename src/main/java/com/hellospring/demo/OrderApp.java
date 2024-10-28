package com.hellospring.demo;

import com.hellospring.demo.member.Grade;
import com.hellospring.demo.member.Member;
import com.hellospring.demo.member.MemberService;
import com.hellospring.demo.order.Order;
import com.hellospring.demo.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item1", 10000);

        System.out.println("order = " + order);
    }
}
