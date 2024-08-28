package com.toastmasters.example.service;

import java.util.List;
import java.util.Optional;

import com.toastmasters.example.entity.Meeting;
import com.toastmasters.example.request.MeetingRequest;
import com.toastmasters.example.response.MeetingResponse;

public interface MeetingService {

    List<MeetingResponse> getAllMeetings();

    MeetingResponse getMeetingById(Long id);

    void deleteMeeting(Long id);

    MeetingResponse updateMeeting(Long id, MeetingRequest meeting);

    MeetingResponse createMeeting(MeetingRequest meeting);
    
}
