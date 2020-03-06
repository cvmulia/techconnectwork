package com.example.techconnect.TechConnect.Airlines.Components;

import com.example.techconnect.TechConnect.Airlines.Models.Bag;
import com.example.techconnect.TechConnect.Airlines.Models.Passenger;
import com.example.techconnect.TechConnect.Airlines.Models.Plane;
import com.example.techconnect.TechConnect.Airlines.Repositories.BagRepository;
import com.example.techconnect.TechConnect.Airlines.Repositories.PassengerRepository;
import com.example.techconnect.TechConnect.Airlines.Repositories.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Data_Loader implements ApplicationRunner {

    @Autowired
    PlaneRepository planeRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    BagRepository bagRepository;

    public Data_Loader() {
    }

    public void run(ApplicationArguments args) {
        Plane plane1 = new Plane("CVM1011","Oz");
        planeRepository.save(plane1);

        Plane plane2 = new Plane ("KOV711", "Somalia");
        planeRepository.save(plane2);

        Plane plane3 = new Plane ("TG1506", "Argentina");
        planeRepository.save(plane3);

        Passenger Claudia = new Passenger("Claudia Mulia", plane3);
        passengerRepository.save(Claudia);

        Passenger Kai = new Passenger ("Kai Visser", plane2);
        passengerRepository.save(Kai);

        Passenger Timo = new Passenger("Timo Goeke", plane1);
        passengerRepository.save(Timo);

        Bag bag1 = new Bag (23, Claudia);
        bagRepository.save(bag1);

        Bag bag2 = new Bag (20, Kai);
        bagRepository.save(bag2);

        Bag bag3 = new Bag (21, Timo);
        bagRepository.save(bag3);

        Bag bag4 = new Bag (19, Timo);
        bagRepository.save(bag4);

        plane1.addPassenger(Timo);
        planeRepository.save(plane1);

        Claudia.addBags(bag1);
        passengerRepository.save(Claudia);

    }
}
