package com.airport.pojo;

import java.math.BigInteger;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="schedule")
public class Schedule {
	

	@Id
	@GeneratedValue
	private BigInteger scheduleId;
	@NotNull
	@Column(name="srcAirport")
	
	@OneToOne(targetEntity = Airport.class, cascade = CascadeType.ALL)
	@JoinColumn(name="scsrcA_fk",referencedColumnName = "scheduleId")
    private Airport srcAirport;
	
	@NotNull
	@Column(name="dstnAirport")
	@Autowired
	@OneToOne(targetEntity = Airport.class, cascade = CascadeType.ALL)
    private Airport dstnAirport;
    
	@NotNull
	@Column(name="deptDateTime")
    private String deptDateTime;
	
	@NotNull
	@Column(name="arrDateTime")
    private String arrDateTime;
	


	public BigInteger getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(BigInteger scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Airport getSrcAirport() {
		return srcAirport;
	}

	public void setSrcAirport(Airport srcAirport) {
		this.srcAirport = srcAirport;
	}

	public Airport getDstnAirport() {
		return dstnAirport;
	}

	public void setDstnAirport(Airport dstnAirport) {
		this.dstnAirport = dstnAirport;
	}

	public String getDeptDateTime() {
		return deptDateTime;
	}

	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}

	public String getArrDateTime() {
		return arrDateTime;
	}

	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", srcAirport=" + srcAirport + ", dstnAirport=" + dstnAirport
				+ ", deptDateTime=" + deptDateTime + ", arrDateTime=" + arrDateTime + "]";
	}
	
	
}
