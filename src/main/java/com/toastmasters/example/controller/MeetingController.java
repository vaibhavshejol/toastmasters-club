package com.toastmasters.example.controller;

import java.util.List;
import java.util.Optional;

import com.toastmasters.example.request.MeetingRequest;
import com.toastmasters.example.response.MeetingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.toastmasters.example.entity.Meeting;
import com.toastmasters.example.service.MeetingService;

@RestController
@RequestMapping("api/meeting")
@CrossOrigin(origins = "http://localhost:3000")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;

    @PostMapping
    public ResponseEntity<MeetingResponse> createMeeting(@RequestBody MeetingRequest meeting) {
        MeetingResponse createdMeeting = meetingService.createMeeting(meeting);
        return ResponseEntity.ok(createdMeeting);
    }

    @GetMapping
    public ResponseEntity<List<MeetingResponse>> getAllMeetings() {
        List<MeetingResponse> meetings = meetingService.getAllMeetings();
        return ResponseEntity.ok(meetings);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MeetingResponse> getMeetingById(@PathVariable Long id) {
        MeetingResponse meeting = meetingService.getMeetingById(id);
        return meeting != null ? ResponseEntity.ok(meeting) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<MeetingResponse> updateMeeting(@PathVariable Long id, @RequestBody MeetingRequest meeting) {
        MeetingResponse updatedMeeting = meetingService.updateMeeting(id, meeting);
        return updatedMeeting != null ? ResponseEntity.ok(updatedMeeting) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMeeting(@PathVariable Long id) {
        meetingService.deleteMeeting(id);
        return ResponseEntity.ok("Meeting deleted successfully...");
    }
}
