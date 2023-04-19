package com.hydroqapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class HydroQApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HydroQApiApplication.class, args);
    }

}
