package com.anas.bookclub.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.aspectj.bridge.IMessageContext;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true )
    @NotBlank(message = "Username name is required")
    @Size(min = 3 , max = 30,message = "Username must be between 3 and 30 characters")
    private String userName;

    @Column(unique = true )
    @NotBlank(message = "Username name is required")
    @Email(message = "the email should be valid")
    private String email;

    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;

    @Transient
    @NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
    private String confirmPas;


    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;



    public User(){}
//_______________all methods Starts from here ___________________

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPas() {
        return confirmPas;
    }

    public void setConfirmPas(String confirm) {
        this.confirmPas = confirm;
    }
}