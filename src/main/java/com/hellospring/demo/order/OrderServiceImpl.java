package com.hellospring.demo.order;

import com.hellospring.demo.discount.DiscountPolicy;
import com.hellospring.demo.discount.FixDiscountPolicy;
import com.hellospring.demo.member.Member;
import com.hellospring.demo.member.MemberRepository;
import com.hellospring.demo.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
