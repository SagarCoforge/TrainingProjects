package com.airport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.Passanger;
import com.airport.repository.PassengerRepository;
import com.airport.services.PassengerService;

public class PassengerServiceImpl implements PassengerService{

	@Autowired
	PassengerRepository passengerRepository;
	@Override
	public Passanger createPassengerDetails(Passanger passengerDetails) {
		// TODO Auto-generated method stub
		return passengerRepository.save(passengerDetails);
	}

	@Override
	public List<Passanger> listOfPassenger(Passanger passenger) {
		List<Passanger> listOfPass=passengerRepository.findAll();
		return listOfPass;
	}

}
