package com.toastmasters.example.response;

import lombok.Data;

@Data
public class RoleResponse {

    private Long roleId;
    private String roleName;
    private String roleDescription;
    private boolean isDeleted;
}