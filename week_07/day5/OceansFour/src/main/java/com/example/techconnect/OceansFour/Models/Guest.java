package com.example.techconnect.OceansFour.Models;

import javax.persistence.*;

@Entity
@Table(name="guests")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private double wallet;

    @Column
    private long score;

    @Column(name="Current_Game")
    private int currentGame;



    public Guest(Long id, String name, int age, double wallet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.score = 0;
        this.currentGame = 0;
    }

    public Guest(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public int getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(int currentGame) {
        this.currentGame = currentGame;
    }
}
