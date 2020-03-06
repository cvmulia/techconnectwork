package com.example.techconnect.TechConnect.Airlines.Models;


import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;

@Entity
@Table (name = "bags")
public class Bag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long id;

    @Column (name = "Weight")
    private Integer weight;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="passenger_id", nullable=false)
    private Passenger passenger;

    public Bag() {
    }

    public Bag(Integer weight, Passenger passenger) {
        this.id = id;
        this.weight = weight;
        this.passenger = passenger;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    // TODO: method to give error if bag is overweight
}
