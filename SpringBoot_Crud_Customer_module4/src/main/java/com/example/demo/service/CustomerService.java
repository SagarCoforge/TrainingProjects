package com.example.demo.service;


import java.util.List;

import java.util.Optional;

import com.example.demo.pojo.Customer;

public interface CustomerService {
	
Customer CreatCustomerDetails(Customer customer); 
	
	// add for customer
		Customer addCustomerDetails(Customer customer);  

		// list of all customers

		List<Customer> ListOfCustomer(Customer customer);  
		


		// view of particular customer by id

	     Optional<Customer> updateCustomerById(long id);  

		// update of particular customer by id

	     Customer updateOfCustomerById(Long id);
	  // Delete of Product
		void deleteCustomer(Integer id);
	

}