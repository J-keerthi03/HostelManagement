package com.example.Jwtcrud.model;

import com.example.Jwtcrud.service.JwtService;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationResponse {
    @Autowired
    @JsonProperty("token")
    private final String token;
    @JsonProperty("message")
    private String message;

    public AuthenticationResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }


    public String getMessage() {
        return message;
    }
}