package com.example.techconnect.database_playground.models;


import javax.persistence.*;

@Entity
@Table(name = "dummy")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Test() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}