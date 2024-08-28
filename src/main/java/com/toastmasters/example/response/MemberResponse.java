package com.toastmasters.example.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MemberResponse {

    private Long memberId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String profession;
    private String email;
    private String contact;
    private String address;
    private boolean isActive;
}