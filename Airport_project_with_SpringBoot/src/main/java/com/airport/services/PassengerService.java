package com.airport.services;

import java.util.List;

import com.airport.pojo.Passanger;

public interface PassengerService {
	
	Passanger createPassengerDetails(Passanger passengerDetails);
	
	List<Passanger> listOfPassenger(Passanger passenger);
	

}
