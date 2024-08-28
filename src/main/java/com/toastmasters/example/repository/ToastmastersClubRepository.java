package com.toastmasters.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toastmasters.example.entity.ToastmastersClub;

public interface ToastmastersClubRepository extends JpaRepository <ToastmastersClub, Long> {
    
}
