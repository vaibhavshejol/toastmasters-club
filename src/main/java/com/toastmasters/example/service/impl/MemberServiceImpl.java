package com.toastmasters.example.service.impl;

import java.util.List;
import java.util.Optional;

import com.toastmasters.example.mapper.MemberMapper;
import com.toastmasters.example.request.MemberRequest;
import com.toastmasters.example.request.StatusRequest;
import com.toastmasters.example.response.MemberResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toastmasters.example.entity.Member;
import com.toastmasters.example.repository.MemberRepository;
import com.toastmasters.example.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
    
    @Autowired
    private MemberRepository memberRepository;

    public List<MemberResponse> getAllMembers() {
        return MemberMapper.INSTANCE.memberEntityListToMemberResponseList(memberRepository.findAll());
    }

    public MemberResponse getMemberById(Long id) {
        return MemberMapper.INSTANCE.memberEntityToMemberResponse(memberRepository.findById(id).get());
    }

    public MemberResponse createMember(MemberRequest memberRequest) {
        Member member = MemberMapper.INSTANCE.memberRequestToMemberEntity(memberRequest);
        return MemberMapper.INSTANCE.memberEntityToMemberResponse(memberRepository.save(member));
    }

    public MemberResponse updateMember(Long id, MemberRequest memberRequest) {
        if (!memberRepository.existsById(id)) {
            return null;
        }
        Member member = MemberMapper.INSTANCE.memberRequestToMemberEntity(memberRequest);
        member.setMemberId(id);
        return MemberMapper.INSTANCE.memberEntityToMemberResponse(memberRepository.save(member));
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

    @Override
    public void updateStatusOfMember(Long id, StatusRequest statusRequest) {
        memberRepository.updateMemberStatus(id, statusRequest.isActive());
   }
}
