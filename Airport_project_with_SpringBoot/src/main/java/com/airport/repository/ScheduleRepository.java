package com.airport.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.pojo.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, BigInteger> {

}
