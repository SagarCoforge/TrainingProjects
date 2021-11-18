package com.airport.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airport.pojo.Airport;
import com.airport.pojo.Booking;
import com.airport.pojo.Flight;
import com.airport.pojo.Passanger;
import com.airport.pojo.Schedule;
import com.airport.pojo.ScheduledFlight;
import com.airport.serviceImpl.AirportServiceImpl;
import com.airport.serviceImpl.BookingServiceImpl;
import com.airport.serviceImpl.FlightServiceImpl;
import com.airport.serviceImpl.ScheduleServiceImpl;
import com.airport.serviceImpl.ScheduledFlightServiceImpl;
import com.airport.services.PassengerService;
@Component
@RestController
@RequestMapping("/aish/api")
public class AirportController {
	
	@Autowired(required = true)
	AirportServiceImpl airportServiceImpl;
	
	@Autowired
	FlightServiceImpl flightServiceImpl;
	
	@Autowired
	BookingServiceImpl bookingServiceImpl;
	
	@Autowired
	ScheduleServiceImpl scheduleServiceImpl;
	
	@Autowired
	ScheduledFlightServiceImpl scheduledFlightServiceImpl;
	
	//PassengerServiceI
	
	@PostMapping("/createairportDetails")
	Airport createProductDetails(@RequestBody Airport airportDetails) {

		Airport airpdtls = airportServiceImpl.CreatAirportDetails(airportDetails);

		return airpdtls;

	}
	
	@PostMapping("/flightDtls")
	Flight createFlightDetails(@RequestBody Flight flightDetails) {
		Flight flightdtls= flightServiceImpl.createFlightDetails(flightDetails);
		return flightdtls;
	}

	@PostMapping("/bookingApi")
	Booking createBookingDetails(@RequestBody Booking bookingDetails) {
		Booking bookingdtls= bookingServiceImpl.CreateBookingDetails(bookingDetails);
		return bookingdtls;
		
	}
	
	@PostMapping("/addSchedule")
	Schedule createScheduleDetails(@RequestBody Schedule scheduleDetails) {
		Schedule scheduledtls=scheduleServiceImpl.CreateScheduleDetails(scheduleDetails);
		return  scheduledtls;
	}
	
	@GetMapping("/showSchedules")
	Schedule getScheduleDetails(@RequestBody BigInteger scheduleId) {
		Schedule scheduleDetailsByid=scheduleServiceImpl.getScheduleDetails(scheduleId);
		return scheduleDetailsByid;
	}
	
	@DeleteMapping("/cancelbookingByid/{id}")
	public Map<String,Boolean> deleteById(@PathVariable(value = "id") BigInteger id) {
	      Map<String,Boolean> response = new HashMap<>();
		
		Optional<Booking> prod = bookingServiceImpl.getBookingByid(id);
		
		if(prod!=null) {
			bookingServiceImpl.deleteBooking(id);
			response.put("deleted", Boolean.TRUE);
			return response;
		}
			
			response.put(" not deleted", Boolean.FALSE);
			return response;
	}
	// search flight
	@GetMapping("/searchScheduledFlightByid")
	Optional<ScheduledFlight> getScheduleFlightDetails(@RequestBody BigInteger scheduleId) {
		Optional<ScheduledFlight> scheduleFlightDetailsByid=scheduledFlightServiceImpl.getScheduledFlightByid(scheduleId);
		return scheduleFlightDetailsByid;
	}
	
	
	


}
