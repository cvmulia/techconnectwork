package com.example.techconnect.TechConnect.Airlines.Controllers;

import com.example.techconnect.TechConnect.Airlines.Models.Bag;
import com.example.techconnect.TechConnect.Airlines.Models.Passenger;
import com.example.techconnect.TechConnect.Airlines.Models.Plane;
import com.example.techconnect.TechConnect.Airlines.Repositories.PassengerRepository;
import com.example.techconnect.TechConnect.Airlines.Repositories.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    PlaneRepository planeRepository;

    //view all passengers ✅
    @GetMapping
    public ResponseEntity<List<Passenger>> getAllPassengers(){
        return new ResponseEntity<>(passengerRepository.findAll(), HttpStatus.OK);
    }

    //view a specific passenger ✅
    @GetMapping(value = "/{id}")
    public ResponseEntity getPassengerById(@PathVariable Long id){
        return new ResponseEntity(passengerRepository.findById(id), HttpStatus.OK);
    }

    //add a passenger ✅
    @PostMapping
    public ResponseEntity<Passenger> addNewPassenger(@RequestBody Passenger passenger){
        passengerRepository.save(passenger);
        return new ResponseEntity<>(passenger, HttpStatus.CREATED);
    }

    @GetMapping(value = "/planes/{id}")
    public ResponseEntity<List<Passenger>> getPassengersByPlanesId(@PathVariable Long id){
        Plane plane = planeRepository.getOne(id);
        List<Passenger> passenger = passengerRepository.findByPlane(plane);
        return new ResponseEntity<>(passenger, HttpStatus.OK);

    }


    @PostMapping(value="/planes/{id}")
    public ResponseEntity<Passenger> addAPassengerToPlane(@PathVariable Long id, @RequestBody Passenger passenger){
        passengerRepository.save(passenger);
        Plane plane = planeRepository.getOne(id);
        plane.addPassenger(passenger);
        planeRepository.save(plane);

        return new ResponseEntity<>(passenger,HttpStatus.CREATED);
    }
}
