package com.queias.passwordManager.service;

import com.queias.passwordManager.DTO.CreateUserDTO;
import com.queias.passwordManager.DTO.ResponseUserDTO;
import com.queias.passwordManager.DTO.UserMapper;
import com.queias.passwordManager.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> _repository = new ArrayList<>();

    public ResponseUserDTO createUser(CreateUserDTO createUserDTO) throws Exception{
        User newUser = UserMapper.toUser(createUserDTO);
        newUser.setId(_repository.size()+1);
        _repository.add(newUser);
        return UserMapper.toResponseUser(newUser);
    }

    public List<ResponseUserDTO> getAllUsers(){
        return _repository.stream().map(UserMapper::toResponseUser).toList();
    }
}
