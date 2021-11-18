package com.airport.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.pojo.Booking;

public interface BookingRepository extends JpaRepository<Booking, BigInteger>{

}
