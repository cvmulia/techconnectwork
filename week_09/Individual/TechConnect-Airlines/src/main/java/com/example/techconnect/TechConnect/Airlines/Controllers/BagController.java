package com.example.techconnect.TechConnect.Airlines.Controllers;

import com.example.techconnect.TechConnect.Airlines.Models.Bag;
import com.example.techconnect.TechConnect.Airlines.Models.Passenger;
import com.example.techconnect.TechConnect.Airlines.Repositories.BagRepository;
import com.example.techconnect.TechConnect.Airlines.Repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BagController {

    @Autowired
    BagRepository bagRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @GetMapping(value = "/bags")
    public ResponseEntity<List<Bag>> getAllBags(){
        return new ResponseEntity<>(bagRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/passengers/{id}/bags")
    public ResponseEntity<List<Bag>> getBagsByPassengersId(@PathVariable Long id){
        Passenger passenger = passengerRepository.getOne(id);
        List<Bag> bag = bagRepository.findByPassenger(passenger);
        return new ResponseEntity<>(bag, HttpStatus.OK);

    }

    @PostMapping(value="/passengers/{id}/bags")
    public ResponseEntity<Bag> addABagToAPassenger(@PathVariable Long id, @RequestBody Bag bag){
        bagRepository.save(bag);
        Passenger passenger = passengerRepository.getOne(id);
        passenger.addBags(bag);
        passengerRepository.save(passenger);

        return new ResponseEntity<>(bag,HttpStatus.CREATED);
    }


}
