package com.toastmasters.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toastmasters.example.entity.Member;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository <Member, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Member m SET m.isActive = :status WHERE m.memberId = :memberId")
    void updateMemberStatus(@Param("memberId") Long memberId, @Param("status") boolean status);
}
