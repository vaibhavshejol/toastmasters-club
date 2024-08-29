package com.toastmasters.example.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.toastmasters.example.mapper.RoleMapper;
import com.toastmasters.example.request.RoleRequest;
import com.toastmasters.example.response.RoleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toastmasters.example.entity.Role;
import com.toastmasters.example.repository.RoleRepository;
import com.toastmasters.example.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    
    @Autowired
    private RoleRepository roleRepository;

    public List<RoleResponse> getAllRoles() {
        return RoleMapper.INSTANCE.roleEntityListToRoleResponseList(roleRepository.findAll());
    }

    public RoleResponse getRoleById(Long id) {
        return RoleMapper.INSTANCE.roleEntityToRoleResponse(roleRepository.findById(id).get());
    }

    public RoleResponse createRole(RoleRequest roleRequest) {
        Role role = RoleMapper.INSTANCE.roleRequestToRoleEntity(roleRequest);
        return RoleMapper.INSTANCE.roleEntityToRoleResponse(roleRepository.save(role));
    }

    public RoleResponse updateRole(Long id, RoleRequest roleRequest) {
        if (!roleRepository.existsById(id)) {
            return null;
        }
        Role role = RoleMapper.INSTANCE.roleRequestToRoleEntity(roleRequest);
        role.setRoleId(id);
        return RoleMapper.INSTANCE.roleEntityToRoleResponse(roleRepository.save(role));
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public void createAllRoles(List<String> roleNames) {
        List<Role> roles = new ArrayList<>();
        for (String roleName : roleNames) {
            Role role = new Role();
            role.setRoleName(roleName);
            roles.add(role);
        }
        List<Role> savedRoles = roleRepository.saveAll(roles);
    }
}
