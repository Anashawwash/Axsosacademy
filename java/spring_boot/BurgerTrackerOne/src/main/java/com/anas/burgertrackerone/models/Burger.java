package com.anas.burgertrackerone.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "burgeres")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 1,message = "Rating must be at least 1")
    @Max(value = 5,message = "Rating cannot exceed 5")
    private Integer rating;


    @NotBlank(message = "this field should not left blank")
    private String burgerName;


    @NotBlank(message = "this field should not left blank")
    private String restaurantName;


    @NotBlank(message = "this field should not left blank")
    private String notes;


    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;




    public Burger(){

    }


    public Burger(Integer rating,String burgerName , String restaurantName,String notes){
        this.burgerName = burgerName;
        this.restaurantName = restaurantName;
        this.rating = rating;
        this.notes = notes;
    }


    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
