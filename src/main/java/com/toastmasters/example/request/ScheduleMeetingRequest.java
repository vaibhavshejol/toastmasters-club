package com.toastmasters.example.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleMeetingRequest {
    private String meetingTitle;
    private String meetingDescription;
    private LocalDate meetingDate;
    private LocalTime meetingStartTime;
    private LocalTime meetingEndTime;
    private List<String> roles;
}
