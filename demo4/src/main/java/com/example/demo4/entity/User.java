package com.example.demo4.entity;

import jakarta.persistence.*;


@Entity
@Table(name="user_study")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String name;
    @Column(name = "pass")
    private String pass;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    public void setName(String name) {
        this.name = name;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }
    public String getPass() {
        return this.pass;
    }

    public String getName() {
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
}