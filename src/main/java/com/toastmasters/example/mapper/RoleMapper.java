package com.toastmasters.example.mapper;

import com.toastmasters.example.entity.Member;
import com.toastmasters.example.entity.Role;
import com.toastmasters.example.request.MemberRequest;
import com.toastmasters.example.request.RoleRequest;
import com.toastmasters.example.response.MemberResponse;
import com.toastmasters.example.response.RoleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    Role roleRequestToRoleEntity(RoleRequest roleRequest);

    RoleResponse roleEntityToRoleResponse(Role role);

    List<RoleResponse> roleEntityListToRoleResponseList(List<Role> roles);
}
