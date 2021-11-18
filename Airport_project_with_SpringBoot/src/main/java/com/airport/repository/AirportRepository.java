package com.airport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.pojo.Airport;

public interface AirportRepository extends JpaRepository<Airport, Integer> {

}
