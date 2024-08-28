package com.toastmasters.example.response;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class MeetingResponse {
    private Long meetingId;
    private String meetingTitle;
    private String meetingDescription;
    private LocalDate meetingDate;
    private LocalTime meetingStartTime;
    private LocalTime meetingEndTime;
}