package com.example.techconnect.TechConnect.Airlines.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long id;

    @Column (name = "Passengers_name")
    private String name;

    @OneToMany(mappedBy="passenger", fetch = FetchType.LAZY)
    private List<Bag> bags;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="plane_id", nullable=false)
    private Plane plane;


    public Passenger() {
    }

    public Passenger(String name, Plane plane) {
        this.name = name;
        this.plane = plane;
        this.bags = new ArrayList<>();
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

    public List<Bag> getBags() {

        return bags;
    }

    public void setBags(List<Bag> bags) {

        this.bags = bags;
    }

    public void addBags (Bag bag){

        this.bags.add(bag);
    }

    public Plane getPlane() {

        return plane;
    }

    public void setPlane(Plane plane) {

        this.plane = plane;
    }
}
