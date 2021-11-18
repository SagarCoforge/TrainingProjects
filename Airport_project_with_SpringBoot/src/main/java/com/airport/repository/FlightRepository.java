package com.airport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.pojo.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
