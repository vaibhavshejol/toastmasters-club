package com.toastmasters.example.service.impl;

import java.util.List;
import java.util.Optional;

import com.toastmasters.example.mapper.MeetingMapper;
import com.toastmasters.example.request.MeetingRequest;
import com.toastmasters.example.request.ScheduleMeetingRequest;
import com.toastmasters.example.response.MeetingResponse;
import com.toastmasters.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import com.toastmasters.example.entity.Meeting;
import com.toastmasters.example.repository.MeetingRepository;
import com.toastmasters.example.service.MeetingService;
import org.springframework.stereotype.Service;

@Service
public class MeetingServiceImpl implements MeetingService {
    
    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private RoleService roleService;

    public List<MeetingResponse> getAllMeetings() {
        return MeetingMapper.INSTANCE.meetingEntityListToMeetingResponseList(meetingRepository.findAll());
    }

    public MeetingResponse getMeetingById(Long id) {
        return MeetingMapper.INSTANCE.meetingEntityToMeetingResponse(meetingRepository.findById(id).get());
    }

    public MeetingResponse createMeeting(MeetingRequest meetingRequest) {
        Meeting meeting = MeetingMapper.INSTANCE.meetingRequestToMeetingEntity(meetingRequest);
        return MeetingMapper.INSTANCE.meetingEntityToMeetingResponse(meetingRepository.save(meeting));
    }

    @Override
    public void shceduleMeeting(ScheduleMeetingRequest scheduleMeetingRequest) {
        MeetingRequest meetingRequest = MeetingMapper.INSTANCE.scheduleMeetingRequestToMeetingEntity(scheduleMeetingRequest);
        MeetingResponse response = this.createMeeting(meetingRequest);
        if(response.getMeetingId() != null){
            List<String> roles = scheduleMeetingRequest.getRoles();
            roleService.createAllRoles(roles);
        }
    }

    public MeetingResponse updateMeeting(Long id, MeetingRequest meetingRequest) {
        if (!meetingRepository.existsById(id)) {
            return null;
        }
        Meeting meeting = MeetingMapper.INSTANCE.meetingRequestToMeetingEntity(meetingRequest);
        meeting.setMeetingId(id);
        return MeetingMapper.INSTANCE.meetingEntityToMeetingResponse(meetingRepository.save(meeting));
    }

    public void deleteMeeting(Long id) {
        meetingRepository.deleteById(id);
    }
}
