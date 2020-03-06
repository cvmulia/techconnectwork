package com.example.techconnect.pirateservice;

import com.example.techconnect.pirateservice.Repositories.PirateRepository;
import com.example.techconnect.pirateservice.Repositories.ShipRepository;
import com.example.techconnect.pirateservice.models.Pirate;
import com.example.techconnect.pirateservice.models.Ship;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreatePirateAndShip(){
		Ship ship = new Ship ("The Black Pearl");
		shipRepository.save(ship);

		Pirate jack = new Pirate ("Jack","Sparrow", 30, ship);
		pirateRepository.save(jack);

	}

}
