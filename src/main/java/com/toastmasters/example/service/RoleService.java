package com.toastmasters.example.service;

import java.util.List;
import java.util.Optional;

import com.toastmasters.example.entity.Role;
import com.toastmasters.example.request.RoleRequest;
import com.toastmasters.example.response.RoleResponse;

public interface RoleService {

    List<RoleResponse> getAllRoles();

    RoleResponse getRoleById(Long id);

    RoleResponse createRole(RoleRequest role);

    RoleResponse updateRole(Long id, RoleRequest role);

    void deleteRole(Long id);
    
}
