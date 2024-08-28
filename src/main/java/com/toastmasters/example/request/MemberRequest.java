package com.toastmasters.example.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberRequest {
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String profession;
    private String email;
    private String contact;
    private String address;
}