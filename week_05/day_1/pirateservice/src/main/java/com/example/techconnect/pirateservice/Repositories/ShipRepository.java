package com.example.techconnect.pirateservice.Repositories;

import com.example.techconnect.pirateservice.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship,Long> {
}
