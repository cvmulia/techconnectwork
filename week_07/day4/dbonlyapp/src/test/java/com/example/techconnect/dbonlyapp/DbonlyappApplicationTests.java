package com.example.techconnect.dbonlyapp;

import com.example.techconnect.dbonlyapp.Classes.Address;
import com.example.techconnect.dbonlyapp.Classes.Company;
import com.example.techconnect.dbonlyapp.Models.User;
import com.example.techconnect.dbonlyapp.Repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DbonlyappApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	Company company;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveAndQueryUser(){
		User user = new User ("James Bond", "j.bond@mi6.gov.uk","17/6/63","007-12345678");
		userRepository.save(user);
		List<User> users = userRepository.findAll();
	}

	@Test
	public void canCreateCompanyAndAddressOldSchool(){
		Address address = new Address("Bank Street",25);
		Company company = new Company(address);
	}

	@Test
	public void canGetCompanyAsBeanAndCustomiseToOurNeeds(){
		Address address = company.getAddress();
		address.setStreet("Argyle");
		address.setNumber(50);
	}



}
