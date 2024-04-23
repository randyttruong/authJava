package com.example.auth.login;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequest {
    
    private String username; 
    private String password; 

    public LoginRequest() { 

    }

    public LoginRequest (String username, String password) {  
        this.username = username; 
        this.password = password; 
    } 

    public String getUsername() { 
        return this.username;
    } 

    public String getPassword() { 
        return this.password;
    }

    public void setUsername(String username) { 
        this.username = username; 
    } 

    public void setPassword(String password) { 
        this.password = password;
    }

    @Override
    public String toString() {  
        return "LoginRequest{"  + "username: " + this.username + 
               "password: " + this.password + "}"; 

    }
}
