package com.example.techconnect.pirateservice.Controllers;

import com.example.techconnect.pirateservice.Repositories.PirateRepository;
import com.example.techconnect.pirateservice.models.Pirate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

    @GetMapping(value="/pirates")
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }

    @GetMapping(value="/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }




}
