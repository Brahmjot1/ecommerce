package com.brahm.ecommerce.dto;

import lombok.Data;

@Data
public class LoginRequestDTO {
    private String email;
    private String password;
}