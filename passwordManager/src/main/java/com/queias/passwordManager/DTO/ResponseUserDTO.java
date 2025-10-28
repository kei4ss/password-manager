package com.queias.passwordManager.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseUserDTO {
    private String name;
    private String login;
    private String email;
}
