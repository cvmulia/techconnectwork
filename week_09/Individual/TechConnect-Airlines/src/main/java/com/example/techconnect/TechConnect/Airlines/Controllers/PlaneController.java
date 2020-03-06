package com.example.techconnect.TechConnect.Airlines.Controllers;

import com.example.techconnect.TechConnect.Airlines.Models.Plane;
import com.example.techconnect.TechConnect.Airlines.Repositories.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlaneController {

    @Autowired
    PlaneRepository planeRepository;

    //view all planes✅
    @GetMapping
    public ResponseEntity<List<Plane>> getAllPlanes(){
        return new ResponseEntity<>(planeRepository.findAll(), HttpStatus.OK);
    }

    //view a specific plane
    @GetMapping(value = "/{id}")
    public ResponseEntity getPlaneById(@PathVariable Long id){
        return new ResponseEntity(planeRepository.findById(id), HttpStatus.OK);
    }

    //add a plane✅
    @PostMapping
    public ResponseEntity<Plane> addNewPlane(@RequestBody Plane plane){
        planeRepository.save(plane);
        return new ResponseEntity<>(plane, HttpStatus.CREATED);
    }






}
