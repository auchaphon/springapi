package com.auchaphon.example.springapi.repositories;

import com.auchaphon.example.springapi.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("memberRepository")
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}