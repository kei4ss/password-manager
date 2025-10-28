package com.queias.passwordManager.controller;

import com.queias.passwordManager.DTO.ResponseUserDTO;
import com.queias.passwordManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<ResponseUserDTO>> getAll(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
