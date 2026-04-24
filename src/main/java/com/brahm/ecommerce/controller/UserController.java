package com.brahm.ecommerce.controller;

import com.brahm.ecommerce.dto.LoginRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.brahm.ecommerce.dto.UserRequestDTO;
import com.brahm.ecommerce.dto.UserResponseDTO;
import com.brahm.ecommerce.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserResponseDTO registerUser(@Valid @RequestBody UserRequestDTO dto) {

        return userService.registerUser(dto);

    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDTO dto) {
        return userService.login(dto);
    }

    @GetMapping("/test")
    public String test() {
        return "Working";
    }


}