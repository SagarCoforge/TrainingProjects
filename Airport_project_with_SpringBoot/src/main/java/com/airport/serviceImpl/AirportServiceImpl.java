package com.airport.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.Airport;
import com.airport.repository.AirportRepository;
import com.airport.services.AirportService;

public class AirportServiceImpl implements AirportService{

	@Autowired
	AirportRepository airportRepository;
	@Override
	public Airport CreatAirportDetails(Airport airportDetails) {
		// TODO Auto-generated method stub
		return airportRepository.save(airportDetails);
	}
	public List<Airport> get(Airport product) {
		 List<Airport> listairportdetails = new ArrayList<Airport>();

			Airport a1 = new Airport();
			a1.setAirportCode("Air101");
			a1.setAirportLocation("Delhi");
			a1.setAirportName("KmpBlr");
			listairportdetails.add(a1);
			return listairportdetails;	
		}
	

}
