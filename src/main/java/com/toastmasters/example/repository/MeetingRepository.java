package com.toastmasters.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toastmasters.example.entity.Meeting;

public interface MeetingRepository extends JpaRepository <Meeting, Long> {
    
}
