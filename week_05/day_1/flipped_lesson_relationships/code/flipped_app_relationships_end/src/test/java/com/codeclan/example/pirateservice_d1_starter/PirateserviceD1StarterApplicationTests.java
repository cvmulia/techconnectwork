package com.codeclan.example.pirateservice_d1_starter;

import com.codeclan.example.pirateservice_d1_starter.models.Pirate;
import com.codeclan.example.pirateservice_d1_starter.models.Raid;
import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import com.codeclan.example.pirateservice_d1_starter.repositories.PirateRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.RaidRepository;
import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateserviceD1StarterApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPirateAndShip(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(pirate1);
	}

	@Test
	public void addPiratesAndRaids(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(pirate1);

		Raid raid1 = new Raid("Tortuga", 100);
		raidRepository.save(raid1);


		pirate1.addRaid(raid1);
		raid1.addPirate(pirate1);
		raidRepository.save(raid1);

	}

	@Test
	public void canFindPirateAbove30(){
		List<Pirate> found = pirateRepository.findByAgeGreaterThan(30);
		assertEquals(7,found.size());
	}

	@Test
	public void canFindRaidByLocation(){
		List<Raid> found = raidRepository.findByLocation("Havana");
		assertEquals(1, found.size());
	}

	@Test
	public void canFindPiratesByRaidId(){
		List<Pirate> foundPirates = pirateRepository.findByRaidsId(1L);
		assertEquals(1,foundPirates.size());
		assertEquals("Jack",foundPirates.get(0).getFirstName());
	}

	@Test
	public void canFindShipWithPiratesFirstName(){
		List<Ship> foundShips = shipRepository.findByPiratesFirstName("Jack");
		assertEquals(1,foundShips.size());
		assertEquals("The Black Pearl", foundShips.get(0).getName());
	}

	@Test
	public void canFindRaidForAGivenShip(){
		Ship foundShips = shipRepository.getOne(3L);
		List<Raid> foundRaids = raidRepository.findByPiratesShip(foundShips);
		assertEquals(2,foundRaids.size());
	}



}
