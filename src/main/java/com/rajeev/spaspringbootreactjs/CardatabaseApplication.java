package com.rajeev.spaspringbootreactjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rajeev.spaspringbootreactjs.domain.Car;
import com.rajeev.spaspringbootreactjs.domain.CarRepository;
import com.rajeev.spaspringbootreactjs.domain.Owner;
import com.rajeev.spaspringbootreactjs.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired	
	private CarRepository repository;

	@Autowired	
	private OwnerRepository orepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Owner owner1 = new Owner("Rajeev" , "Jha");
			Owner owner2 = new Owner("Sushma" , "Kulkarni");
			orepository.save(owner1);
			orepository.save(owner2);

			repository.save(new Car("Ferrari", "458", "Red", "KKO-0212", 2018, 230000, owner2));
			repository.save(new Car("BMW", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1));
			repository.save(new Car("Lexus", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2));

		};
	}	
}
