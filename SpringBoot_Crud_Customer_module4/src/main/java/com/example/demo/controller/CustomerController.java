package com.example.demo.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Customer;
import com.example.demo.serviceImpl.CustomerServiceImpl;
@RestController
@RequestMapping("/yam/api")

public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	// api for add customer details
	@PostMapping("/createcustomer")
	Customer createProductDetails(@RequestBody Customer customerinfo) {

		Customer customerinfo1 = customerServiceImpl.CreatCustomerDetails(customerinfo);

		return customerinfo1;

	}

	// api for get product details by id
	@GetMapping("/customer/{id}")
	Optional<Customer> updateCustomerById(@PathVariable(value = "id") Integer id) {

		Optional<Customer> prod = customerServiceImpl.updateOfCustomerById(id);

		return prod;

	}

	// api for get product list
	@GetMapping("/listofcustomer")
	public List<Customer> listOfcustomers(Customer customer) {

		List<Customer> listOfCustomerdetails = customerServiceImpl.ListOfCustomer(customer);

		return listOfCustomerdetails;
	}

	// api for delete product by id
	@DeleteMapping("/customerdeletedbyid/{id}")
	public Map<String,Boolean> deleteById(@PathVariable(value = "id") Integer id) {
	      Map<String,Boolean> response = new HashMap<>();
		
		Optional<Customer> prod = customerServiceImpl.updateOfCustomerById(id);
		
		if(prod!=null) {
			customerServiceImpl.deleteCustomer(id);
			response.put("deleted", Boolean.TRUE);
			return response;
		}
			
			response.put(" not deleted", Boolean.FALSE);
			return response;
	}

}