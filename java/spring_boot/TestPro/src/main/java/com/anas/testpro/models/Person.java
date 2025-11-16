package com.anas.testpro.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "persons")
public class Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "this should not left blank")
    @Size(min = 5,max = 20 , message = "error")
    private String name;

    @OneToOne(mappedBy = "person" ,cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private Passport passport;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Long getId() {
        return id;
    }


}
