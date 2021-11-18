package com.airport.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.pojo.ScheduledFlight;

public interface ScheduledFlightRepository extends JpaRepository<ScheduledFlight, BigInteger>{

}
