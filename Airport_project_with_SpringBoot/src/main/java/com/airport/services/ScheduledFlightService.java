package com.airport.services;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.airport.pojo.ScheduledFlight;

public interface ScheduledFlightService {
	ScheduledFlight CreateScheduledFlight(ScheduledFlight ScheduledFlight);
	
//ScheduledFlight updateBooking(BigInteger Id);
	List<ScheduledFlight> ListOfScheduledFlight(ScheduledFlight ScheduledFlight);  
	// Delete of Product

	//void deleteBooking(BigInteger id); //done

	// view of particular Product by id

     Optional<ScheduledFlight> getScheduledFlightByid(BigInteger id);  

}
