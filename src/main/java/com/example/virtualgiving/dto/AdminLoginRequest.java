package com.example.virtualgiving.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminLoginRequest {
    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
