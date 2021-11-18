package com.airport.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="Flight")
public class Flight {
	@Id
	
	private int flightno;

	

	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}



	@Override
	public String toString() {
		return "Flight [flightno=" + flightno + "]";
	}
	

}
