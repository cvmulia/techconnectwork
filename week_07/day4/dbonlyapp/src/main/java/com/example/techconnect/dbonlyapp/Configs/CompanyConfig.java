package com.example.techconnect.dbonlyapp.Configs;

import com.example.techconnect.dbonlyapp.Classes.Address;
import org.springframework.context.annotation.Bean;

public class CompanyConfig {

    // this class will configure the company and address on how it can be created as a bean
    // because spring does not know how to give it the arguments street and number

    // this method creates an Address object for Company
    // to use as a bean

    @Bean
    public Address address(){
        return new Address("Bank Street", 25);
    }


}
