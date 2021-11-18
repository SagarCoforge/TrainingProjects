package com.airport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.airport.serviceImpl.AirportServiceImpl","com.airport.controller.AirportController"})

public class AirportProjectWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportProjectWithSpringBootApplication.class, args);
	}

}
