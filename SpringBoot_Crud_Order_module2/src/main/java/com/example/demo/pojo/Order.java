package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(name="product")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name="orderid")
	private long orderid;
	
	@NotNull
	@Column(name="dateCreated")
	private String dateCreated;
	
	@NotNull
	@Column(name="dateShipped")
	private String dateShipped;
	
	@NotNull
	@Column(name="customerName")
	private String customerName;
	
	@NotNull
	@Column(name="status")
	private String status;

	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(String dateShipped) {
		this.dateShipped = dateShipped;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", dateCreated=" + dateCreated + ", dateShipped=" + dateShipped
				+ ", customerName=" + customerName + ", status=" + status + "]";
	}
	
	
}
