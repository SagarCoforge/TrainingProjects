package com.airport.serviceImpl;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.ScheduledFlight;
import com.airport.repository.ScheduledFlightRepository;
import com.airport.services.ScheduledFlightService;

public class ScheduledFlightServiceImpl implements ScheduledFlightService {
	@Autowired
	ScheduledFlightRepository scheduledFlightRepository;

	@Override
	public ScheduledFlight CreateScheduledFlight(ScheduledFlight ScheduledFlight) {
		// TODO Auto-generated method stub
		return scheduledFlightRepository.save(ScheduledFlight);
	}

	@Override
	public List<ScheduledFlight> ListOfScheduledFlight(ScheduledFlight ScheduledFlight) {
		List<ScheduledFlight> listOfScheduledFlight = scheduledFlightRepository.findAll();

		return listOfScheduledFlight;
	}

	@Override
	public Optional<ScheduledFlight> getScheduledFlightByid(BigInteger id) {
		Optional<ScheduledFlight> scheduledFlight = scheduledFlightRepository.findById(id);
		return scheduledFlight;
	}

}
