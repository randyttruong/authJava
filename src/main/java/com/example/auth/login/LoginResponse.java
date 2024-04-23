package com.example.auth.login;

public class LoginResponse {

    private boolean success; 
    private String message; 
    private String token; // auth token: just here for posterity

    public LoginResponse(boolean success, String message) {  
        this.success = success;
        this.message = message; 
    }

    public LoginResponse(boolean success, String message, String token) {  
        this(success, message);
        this.token = token; 
    }

    public boolean getSuccess() { 
        return this.success;
    }

    public String getMessage() { 
        return this.message;
    }

    public String getToken() { 
        return this.token;
    }

    public void setSuccess(boolean success) { 
        this.success = success;
    }

    public void setMessage(String message) { 
        this.message = message;
    }

    public void setToken(String token) { 
        this.token = token;
    }
    
}
