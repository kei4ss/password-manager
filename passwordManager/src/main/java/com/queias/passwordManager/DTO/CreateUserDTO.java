package com.queias.passwordManager.DTO;

import com.queias.passwordManager.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateUserDTO {
    private String name;
    private String email;
    private String login;
    private String password;
}
