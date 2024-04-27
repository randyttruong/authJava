package com.example.auth.register;

import org.springframework.web.bind.annotation.RestController;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.auth.entity.User;
import com.example.auth.repository.UserRepository;


@RestController
public class RegisterController {

    private final UserRepository userRepository;

    public RegisterController(UserRepository userRepository) { 
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) { 
        String username = registerRequest.getUsername();
        String password = registerRequest.getPassword();
        String firstName = registerRequest.getFirstName();
        String lastName = registerRequest.getLastName();
        String email = registerRequest.getEmail();

        if (username.isEmpty() 
            || password.isEmpty()
            || firstName.isEmpty()
            || lastName.isEmpty()) { 
                return ResponseEntity.status(400)
                                     .body(new RegisterResponse(false,
                                                                "Register failed: Please provide the necessary fields"));
            }

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setEmail(email);

        if (this.userRepository.existsByUsername(username)) { 
            return ResponseEntity.status(400)
                                 .body(new RegisterResponse(false, 
                                                            "Registration unsuccessful. Username already exists."));
        } else { 
        userRepository.save(newUser);
        
        return ResponseEntity.status(200)
                             .body(new RegisterResponse(true, 
                                                        "Register success. Please login."));
        }
    }
}
