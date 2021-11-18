package com.airport.services;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.airport.pojo.Booking;

public interface BookingService {
	
	Booking CreateBookingDetails(Booking bookingDetails);
	
	Booking updateBooking(BigInteger Id);
	List<Booking> ListOfBookings(Booking booking);  
	// Delete of Product

	void deleteBooking(BigInteger id); //done

	// view of particular Product by id

     Optional<Booking> getBookingByid(BigInteger id);  


}
