package com.airport.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.Flight;
import com.airport.repository.FlightRepository;
import com.airport.services.FlightService;

public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightRepository flightRepository;
	@Override
	public Flight createFlightDetails(Flight flightDetails) {
		// TODO Auto-generated method stub
		return flightRepository.save(flightDetails);
	}

}
