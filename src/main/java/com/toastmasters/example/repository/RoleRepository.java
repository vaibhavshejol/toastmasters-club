package com.toastmasters.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toastmasters.example.entity.Role;

public interface RoleRepository extends JpaRepository <Role, Long> {
    
}
