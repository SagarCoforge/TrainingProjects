package com.airport.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.pojo.Passanger;

public interface PassengerRepository extends JpaRepository<Passanger, BigInteger> {

}
