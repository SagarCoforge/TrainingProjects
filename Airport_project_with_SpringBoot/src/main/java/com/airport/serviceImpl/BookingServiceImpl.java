package com.airport.serviceImpl;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.Booking;
import com.airport.repository.BookingRepository;
import com.airport.services.BookingService;

public class BookingServiceImpl implements BookingService{

	@Autowired
	BookingRepository bookingRepository;
	@Override
	public Booking CreateBookingDetails(Booking bookingDetails) {
		// TODO Auto-generated method stub
		return bookingRepository.save(bookingDetails);
	}
	@Override
	public Booking updateBooking(BigInteger Id) {
		Booking booking=null;
		try {
			 booking = bookingRepository.findById(Id)
					.orElseThrow(() -> new Exception("Prodcut not found for this id :: " + Id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booking;
	}
	@Override
	public List<Booking> ListOfBookings(Booking booking) {
		List<Booking> listOfBooking = bookingRepository.findAll();

		return listOfBooking;
	}
	@Override
	public void deleteBooking(BigInteger id) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(id);
	}
	@Override
	public Optional<Booking> getBookingByid(BigInteger id) {
		Optional<Booking> booking = bookingRepository.findById(id);

		return booking;
	}

}
