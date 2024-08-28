package com.toastmasters.example.mapper;

import com.toastmasters.example.entity.Member;
import com.toastmasters.example.request.MemberRequest;
import com.toastmasters.example.response.MemberResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper {
    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    Member memberRequestToMemberEntity(MemberRequest memberRequest);

    MemberResponse memberEntityToMemberResponse(Member member);

    List<MemberResponse> memberEntityListToMemberResponseList(List<Member> members);
}
