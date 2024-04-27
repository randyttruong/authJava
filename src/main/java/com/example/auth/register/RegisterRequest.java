package com.example.auth.register;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterRequest {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    public RegisterRequest(String username, String password, String firstName, String lastName, String email) { 
        this.username = username; 
        this.password = password;
        this.firstName = firstName; 
        this.lastName = lastName;
        this.email = email;
    }

    public String getUsername() { 
        return this.username;
    }

    public String getPassword() { 
        return this.password;
    }

    public String getFirstName() { 
        return this.firstName;
    }
    public String getLastName() { 
        return this.lastName;
    }
    public String getEmail() { 
        return this.email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) { 
        this.password = password;
    }

    public void setFirstName(String firstName) { 
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
