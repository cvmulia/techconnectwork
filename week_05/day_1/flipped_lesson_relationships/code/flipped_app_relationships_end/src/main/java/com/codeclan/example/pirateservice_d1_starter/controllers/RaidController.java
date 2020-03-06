package com.codeclan.example.pirateservice_d1_starter.controllers;


import com.codeclan.example.pirateservice_d1_starter.models.Raid;
import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import com.codeclan.example.pirateservice_d1_starter.repositories.RaidRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping(value="/raids")
    public ResponseEntity<List<Raid>> foundRaidsFilteredByLocation(
        @RequestParam (name = "location", required =false) String location){
    if (location!= null){
        return new ResponseEntity<>(raidRepository.findByLocation(location), HttpStatus.OK);
    }return new ResponseEntity<>(raidRepository.findAll(),HttpStatus.OK);

    }



//    @GetMapping(value = "/raids")
//    public ResponseEntity<List<Raid>> getAllRaids(){
//        return  new ResponseEntity<>(raidRepository.findAll(), HttpStatus.OK);
//
//    }

    @GetMapping(value = "/raids/{id}")
    public ResponseEntity<Raid> getRaid(@PathVariable Long id){
        return new ResponseEntity(raidRepository.findById(id), HttpStatus.OK);
    }



}
