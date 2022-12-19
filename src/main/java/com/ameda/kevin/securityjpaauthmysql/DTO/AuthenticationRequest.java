package com.ameda.kevin.securityjpaauthmysql.DTO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class AuthenticationRequest {
    private String email;
    private String password;
}
