package com.simplilearn.petadoption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetadoptionApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.location", "application.properties");
		SpringApplication.run(PetadoptionApplication.class, args);
	}

}
