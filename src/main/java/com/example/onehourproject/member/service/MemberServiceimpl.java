package com.example.onehourproject.member.service;

import com.example.onehourproject.member.repository.IMemberRepository;
import com.example.onehourproject.member.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceimpl implements IMemberService{

    private final IMemberRepository memberRepository;
    @Override
    public String join(String id, String name, String phoneNumber) {
        Member member = Member.builder()
                        .id(id)
                        .name(name)
                        .phoneNumber(phoneNumber)
                        .build();
        memberRepository.save(member);
        return "success";
    }
}
