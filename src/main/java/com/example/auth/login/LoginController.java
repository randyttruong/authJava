package com.example.auth.login;

import org.springframework.web.bind.annotation.RestController;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.auth.repository.*;
import com.example.auth.entity.User;

@RestController
public class LoginController {

    private final UserRepository userRepository; 
    
    public LoginController(UserRepository userRepository) { 
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword(); 

        if (username.isEmpty() || password.isEmpty()) {  
            ResponseEntity.status(400)
                          .body(new LoginResponse(false, "Login failed: Please provide a username or password"));
        }
        
        if (this.userRepository.existsByUsername(username)) {  
            User currUser = this.userRepository.findByUsername(username);

            String currPass = currUser.getPassword(); 

            if (!password.equals(currPass)) { 
                return ResponseEntity.status(400)
                                     .body(new LoginResponse(false, 
                                                             "Incorrect password."));
            }
            return ResponseEntity.status(200)
                                .body(new LoginResponse(true, 
                                "Login successful?"));
        } else { 
            return ResponseEntity.status(400)
                                 .body(new LoginResponse(false, 
                                 "Unable to find the username?")); 
        }

    }
    
}
