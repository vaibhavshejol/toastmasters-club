package com.toastmasters.example.service;

import java.util.List;
import java.util.Optional;

import com.toastmasters.example.entity.Member;
import com.toastmasters.example.request.MemberRequest;
import com.toastmasters.example.request.StatusRequest;
import com.toastmasters.example.response.MemberResponse;

public interface MemberService {

    List<MemberResponse> getAllMembers();

    MemberResponse getMemberById(Long id);

    MemberResponse createMember(MemberRequest member);

    MemberResponse updateMember(Long id, MemberRequest member);

    void deleteMember(Long id);

    void updateStatusOfMember(Long id, StatusRequest statusRequest);
}
