package com.example.auth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String username;
    private String password;
    private String firstname; 
    private String lastname; 
    private String email; 

    public User() {}

    public User(String username, String password, String firstname, String lastname, String email) { 
        this.username = username; 
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getUsername() { 
        return this.username;
    }

    public String getPassword() { 
        return this.password;
    }

    public String getFirstName() { 
        return this.firstname;
    }
    public String getLastName() { 
        return this.lastname;
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
        this.firstname = firstName;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    




    
}
