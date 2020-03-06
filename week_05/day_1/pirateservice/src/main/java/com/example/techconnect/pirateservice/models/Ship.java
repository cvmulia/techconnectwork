package com.example.techconnect.pirateservice.models;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;


public class Ship {


    private String name;
    @OneToMany(mappedBy = "ship")
    private List<Pirate> pirates;

    public Ship(String name) {
        this.name = name;
        this.pirates = new ArrayList<Pirate>();
    }


}
