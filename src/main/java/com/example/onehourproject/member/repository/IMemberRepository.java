package com.example.onehourproject.member.repository;

import com.example.onehourproject.member.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMemberRepository extends JpaRepository<Member,Long> {
}
