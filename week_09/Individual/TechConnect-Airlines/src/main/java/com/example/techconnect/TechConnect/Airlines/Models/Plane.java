package com.example.techconnect.TechConnect.Airlines.Models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="planes")
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "id")
    private Long id;

    @Column (name = "Flight_number")
    private String flightNumber;

    @Column (name = "Destination")
    private String destination;


    @OneToMany(mappedBy="plane", fetch = FetchType.LAZY)
    private List<Passenger> passengers;

    public Plane() {
    }

    public Plane(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    // TODO: method to track capacity✅
    public Integer checkHowFullThePlaneIs(){
        Integer size = passengers.size();
        return  size;
    }

    // TODO: method to track maximum weight
    public void checkBaggage(){

    }
}
