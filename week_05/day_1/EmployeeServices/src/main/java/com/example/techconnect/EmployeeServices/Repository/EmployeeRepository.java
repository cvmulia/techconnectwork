package com.example.techconnect.EmployeeServices.Repository;

import com.example.techconnect.EmployeeServices.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
