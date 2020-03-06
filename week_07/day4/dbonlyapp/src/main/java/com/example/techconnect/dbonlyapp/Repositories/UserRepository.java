package com.example.techconnect.dbonlyapp.Repositories;

import com.example.techconnect.dbonlyapp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
