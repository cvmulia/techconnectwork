package com.example.techconnect.TechConnect.Airlines.Repositories;

import com.example.techconnect.TechConnect.Airlines.Models.Bag;
import com.example.techconnect.TechConnect.Airlines.Models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BagRepository extends JpaRepository<Bag, Long> {
    List<Bag> findByPassenger(Passenger passenger);
}
