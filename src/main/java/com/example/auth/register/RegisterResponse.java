package com.example.auth.register;

public class RegisterResponse {

    private boolean success;
    private String message;

    RegisterResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) { 
        this.message = message;
    }
    

}
