package com.fullstack.zwigato.auth_users.dto;

import lombok.Data;

@Data
public class LoginResponse {

    private String token;

    private List<Role> roles;

}
