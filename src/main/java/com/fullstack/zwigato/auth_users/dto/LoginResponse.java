package com.fullstack.zwigato.auth_users.dto;

import com.fullstack.zwigato.role.entity.Role;
import lombok.Data;

import java.util.List;

@Data
public class LoginResponse {

    private String token;

    private List<Role> roles;

}
