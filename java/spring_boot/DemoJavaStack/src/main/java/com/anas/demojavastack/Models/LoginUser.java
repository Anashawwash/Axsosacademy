package com.anas.demojavastack.Models;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginUser {

    @NotBlank(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String loginEmail;

    @NotBlank(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String confarm;

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    public String getConfarm() {
        return confarm;
    }

    public void setConfarm(String confarm) {
        this.confarm = confarm;
    }
}
