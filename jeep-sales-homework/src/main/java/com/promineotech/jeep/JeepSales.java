package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// class level annotation
@SpringBootApplication
public class JeepSales {
	
	public static void main(String[] args) {
		// calling SpringApplication
		SpringApplication.run(JeepSales.class, args);
	}

}
