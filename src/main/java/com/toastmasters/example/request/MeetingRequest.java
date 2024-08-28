package com.toastmasters.example.request;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class MeetingRequest {

    private String meetingTitle;
    private String meetingDescription;
    private LocalDate meetingDate;
    private LocalTime meetingStartTime;
    private LocalTime meetingEndTime;
}