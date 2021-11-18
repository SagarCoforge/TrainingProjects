package com.airport.serviceImpl;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.Schedule;
import com.airport.repository.ScheduleRepository;
import com.airport.services.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService{

	@Autowired
	ScheduleRepository scheduleRepository;
	@Override
	public Schedule CreateScheduleDetails(Schedule scheduleDetails) {
		// TODO Auto-generated method stub
		return scheduleRepository.save(scheduleDetails);
	}

	@Override
	public Schedule getScheduleDetails(BigInteger scheduleId) {
		// TODO Auto-generated method stub
		return scheduleRepository.getById(scheduleId);
	}

}
