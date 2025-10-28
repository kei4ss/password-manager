package com.queias.passwordManager.DTO;

import com.queias.passwordManager.model.User;

public class UserMapper {
    public static User toUser(CreateUserDTO createUserDTO){
        return new User(createUserDTO.getName(), createUserDTO.getEmail(), createUserDTO.getLogin(), createUserDTO.getPassword());
    }
    public static ResponseUserDTO toResponseUser(User user){
        return new ResponseUserDTO(user.getName(), user.getLogin(), user.getEmail());
    }
}
