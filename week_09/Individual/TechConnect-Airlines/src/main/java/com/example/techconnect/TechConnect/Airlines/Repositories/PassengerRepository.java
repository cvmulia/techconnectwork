package com.example.techconnect.TechConnect.Airlines.Repositories;

import com.example.techconnect.TechConnect.Airlines.Models.Bag;
import com.example.techconnect.TechConnect.Airlines.Models.Passenger;
import com.example.techconnect.TechConnect.Airlines.Models.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    List<Passenger> findByPlane(Plane plane);
}
