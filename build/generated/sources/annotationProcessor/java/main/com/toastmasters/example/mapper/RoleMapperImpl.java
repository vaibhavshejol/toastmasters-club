package com.toastmasters.example.mapper;

import com.toastmasters.example.entity.Role;
import com.toastmasters.example.request.RoleRequest;
import com.toastmasters.example.response.RoleResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-09T09:49:31+0530",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Microsoft)"
)
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role roleRequestToRoleEntity(RoleRequest roleRequest) {
        if ( roleRequest == null ) {
            return null;
        }

        Role.RoleBuilder role = Role.builder();

        role.roleName( roleRequest.getRoleName() );
        role.roleDescription( roleRequest.getRoleDescription() );

        return role.build();
    }

    @Override
    public RoleResponse roleEntityToRoleResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleResponse roleResponse = new RoleResponse();

        roleResponse.setRoleId( role.getRoleId() );
        roleResponse.setRoleName( role.getRoleName() );
        roleResponse.setRoleDescription( role.getRoleDescription() );
        roleResponse.setDeleted( role.isDeleted() );

        return roleResponse;
    }

    @Override
    public List<RoleResponse> roleEntityListToRoleResponseList(List<Role> roles) {
        if ( roles == null ) {
            return null;
        }

        List<RoleResponse> list = new ArrayList<RoleResponse>( roles.size() );
        for ( Role role : roles ) {
            list.add( roleEntityToRoleResponse( role ) );
        }

        return list;
    }
}
