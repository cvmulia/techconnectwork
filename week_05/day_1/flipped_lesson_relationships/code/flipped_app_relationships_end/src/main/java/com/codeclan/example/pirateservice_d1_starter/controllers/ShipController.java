package com.codeclan.example.pirateservice_d1_starter.controllers;

import com.codeclan.example.pirateservice_d1_starter.models.Pirate;
import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import com.codeclan.example.pirateservice_d1_starter.repositories.PirateRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping(value = "/ships")
    public ResponseEntity<List<Ship>> getAllShips(){
        return  new ResponseEntity<>(shipRepository.findAll(), HttpStatus.OK);

    }

    @GetMapping(value = "/ships/{id}")
    public ResponseEntity<Ship> getShip(@PathVariable Long id){
        return new ResponseEntity(shipRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value= "/ships/pirates")
    public ResponseEntity<List<Ship>> findShipsThatHavePiratesNameQueryString(
        @RequestParam (name="name") String name){
            return new ResponseEntity<>(shipRepository.findByPiratesFirstName(name), HttpStatus.OK);
        }


}