package com.example.techconnect.EmployeeServices;

import com.example.techconnect.EmployeeServices.Models.Employee;
import com.example.techconnect.EmployeeServices.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServicesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee claudia = new Employee ("Claudia Vembryani","Mulia",24,"E871891",
				"claudiavembryani@gmail.com");
		employeeRepository.save(claudia);

	}

}
