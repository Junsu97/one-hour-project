package com.example.onehourproject.member.repository;

import com.example.onehourproject.member.repository.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired private IMemberRepository memberRepository;

    @Test
    public void crudTest(){
        Member member = Member.builder()
                .id("faker")
                .name("페이커")
                .phoneNumber("010-0000-0000")
                .build();

        // create test
        memberRepository.save(member);

        // get test
        Member foundMember = memberRepository.findById(1L).get();
    }

}
