package com.toastmasters.example.response;

import lombok.Data;

@Data
public class ToastmastersClubResponse {

    private Long clubId;
    private String clubName;
    private String clubLocation;
    String clubContact;
}