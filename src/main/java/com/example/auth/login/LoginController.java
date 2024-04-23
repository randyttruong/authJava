package com.example.auth.login;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword(); 

        if (username.isEmpty() || password.isEmpty()) {  
            ResponseEntity.status(400)
                          .body(new LoginResponse(false, "Login failed: Please provide a username or password"));
        }
        

        // Fill in the rest of the logic here 

        return ResponseEntity.status(200)
                             .body(new LoginResponse(true, "Login successful"));
    }
    
}
