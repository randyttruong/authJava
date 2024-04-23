package com.example.auth.register;

import org.springframework.web.bind.annotation.RestController;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class RegisterController {
    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) { 
        //TODO: process POST request

        String username = registerRequest.getUsername();
        String password = registerRequest.getPassword();
        String firstName = registerRequest.getFirstName();
        String lastName = registerRequest.getLastName();

        if (username.isEmpty() 
            || password.isEmpty()
            || firstName.isEmpty()
            || lastName.isEmpty()) { 
                return ResponseEntity.status(400)
                                     .body(new RegisterResponse(false,
                                                                "Register failed: Please provide the necessary fields"));
            }

        // TODO: Add to the database 
        
        return ResponseEntity.status(200)
                             .body(new RegisterResponse(true, "Register success. Please login."));
    }
}
