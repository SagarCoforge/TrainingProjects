package com.airport.services;

import java.math.BigInteger;
import java.util.List;

import com.airport.pojo.Schedule;

public interface ScheduleService {

	Schedule CreateScheduleDetails(Schedule scheduleDetails);
    Schedule getScheduleDetails(BigInteger scheduleId);	
}

