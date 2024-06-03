package com.AirlineManager.AirlineManager.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;

    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Password is mandatory")
    private String password;

    @Email(message = "Email should be valid")
    private String email;

    private String role = "USER";  // default role
}
