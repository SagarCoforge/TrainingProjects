package com.airport.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;



@Entity
@Table(name="airport")
public class Airport {
	@Id
	@GeneratedValue
	private int airportCode;
	
	@NotNull
	@Column(name="airportLocation")
    private String airportLocation;
	
	@NotNull
	@Column(name="airportName")
    private String airportName;
	
	public int getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String string) {
		this.airportCode = string;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	@Override
	public String toString() {
		return "Airport [airportCode=" + airportCode + ", airportLocation=" + airportLocation + ", airportName="
				+ airportName + "]";
	}
	
	
    
    
}
