package com.airport.pojo;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="scheduledflight")
public class ScheduledFlight {
	@Id
	@GeneratedValue
	private BigInteger scheduleFlightId;
	
		
	@NotNull
	@Column(name="flight")
	@OneToMany(targetEntity = Flight.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "scheduledFl_fk",referencedColumnName = "scheduleFlightId" )
    private Flight flight;
	
	@NotNull
	@Column(name="availableSeats")
    private Integer availableSeats;
	
	@NotNull
	@Column(name="schedule")
    private Schedule schedule;

	public BigInteger getScheduleFlightId() {
		return scheduleFlightId;
	}

	public void setScheduleFlightId(BigInteger scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "ScheduledFlight [scheduleFlightId=" + scheduleFlightId + ", flight=" + flight + ", availableSeats="
				+ availableSeats + ", schedule=" + schedule + "]";
	}
	
	
}
