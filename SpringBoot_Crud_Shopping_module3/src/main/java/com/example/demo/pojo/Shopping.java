package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="shopping")
public class Shopping {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@NotEmpty
		@Column(name="shopoid")
		private Integer shoppingid;
		
		@NotNull
		@Column(name="shopotype")
		private String shoppingtype;
		
		@NotNull
		@Column(name="shopoaddress")
		private String shoppingaddress;
		
		public Integer getShoppingid() {
			return shoppingid;
		}
		public void setShoppingid(Integer shoppingid) {
			this.shoppingid = shoppingid;
		}
		public String getShoppingtype() {
			return shoppingtype;
		}
		public void setShoppingtype(String shoppingtype) {
			this.shoppingtype = shoppingtype;
		}
		public String getShoppingaddress() {
			return shoppingaddress;
		}
		public void setShoppingaddress(String shoppingaddress) {
			this.shoppingaddress = shoppingaddress;
		}
		@Override
		public String toString() {
			return "Shopping [shoppingid=" + shoppingid + ", shoppingtype=" + shoppingtype + ", shoppingaddress="
					+ shoppingaddress + ", getShoppingid()=" + getShoppingid() + ", getShoppingtype()=" + getShoppingtype()
					+ ", getShoppingaddress()=" + getShoppingaddress() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		

	}

