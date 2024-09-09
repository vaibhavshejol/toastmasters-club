package com.toastmasters.example.mapper;

import com.toastmasters.example.entity.Member;
import com.toastmasters.example.request.MemberRequest;
import com.toastmasters.example.response.MemberResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-09T09:49:31+0530",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Microsoft)"
)
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member memberRequestToMemberEntity(MemberRequest memberRequest) {
        if ( memberRequest == null ) {
            return null;
        }

        Member.MemberBuilder member = Member.builder();

        member.firstName( memberRequest.getFirstName() );
        member.middleName( memberRequest.getMiddleName() );
        member.lastName( memberRequest.getLastName() );
        member.gender( memberRequest.getGender() );
        member.dateOfBirth( memberRequest.getDateOfBirth() );
        member.profession( memberRequest.getProfession() );
        member.email( memberRequest.getEmail() );
        member.contact( memberRequest.getContact() );
        member.address( memberRequest.getAddress() );

        return member.build();
    }

    @Override
    public MemberResponse memberEntityToMemberResponse(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberResponse memberResponse = new MemberResponse();

        memberResponse.setMemberId( member.getMemberId() );
        memberResponse.setFirstName( member.getFirstName() );
        memberResponse.setMiddleName( member.getMiddleName() );
        memberResponse.setLastName( member.getLastName() );
        memberResponse.setGender( member.getGender() );
        memberResponse.setDateOfBirth( member.getDateOfBirth() );
        memberResponse.setProfession( member.getProfession() );
        memberResponse.setEmail( member.getEmail() );
        memberResponse.setContact( member.getContact() );
        memberResponse.setAddress( member.getAddress() );
        memberResponse.setActive( member.isActive() );

        return memberResponse;
    }

    @Override
    public List<MemberResponse> memberEntityListToMemberResponseList(List<Member> members) {
        if ( members == null ) {
            return null;
        }

        List<MemberResponse> list = new ArrayList<MemberResponse>( members.size() );
        for ( Member member : members ) {
            list.add( memberEntityToMemberResponse( member ) );
        }

        return list;
    }
}
