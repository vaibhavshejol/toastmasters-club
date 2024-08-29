package com.toastmasters.example.mapper;

import com.toastmasters.example.entity.Meeting;
import com.toastmasters.example.request.MeetingRequest;
import com.toastmasters.example.request.ScheduleMeetingRequest;
import com.toastmasters.example.response.MeetingResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MeetingMapper {
    MeetingMapper INSTANCE = Mappers.getMapper(MeetingMapper.class);

    Meeting meetingRequestToMeetingEntity(MeetingRequest meetingRequest);

    MeetingResponse meetingEntityToMeetingResponse(Meeting meeting);

    List<MeetingResponse> meetingEntityListToMeetingResponseList(List<Meeting> meetings);

    MeetingRequest scheduleMeetingRequestToMeetingEntity(ScheduleMeetingRequest scheduleMeetingRequest);
}
