package com.example.techconnect.database_playground.components;


import com.example.techconnect.database_playground.models.Test;
import com.example.techconnect.database_playground.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    TestRepository testRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Test dutchman = new Test();
        testRepository.save(dutchman);
    }
}