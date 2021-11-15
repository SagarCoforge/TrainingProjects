package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Shopping;

public interface ShoppingService {

	Shopping creatShoppingDetails(Shopping customer);

	// add for customer
	Shopping addShoppingDetails(Shopping customer);

	// list of all customers

	List<Shopping> ListOfCustomer(Shopping customer);

	// view of particular customer by id

	Optional<Shopping> updateShoppingById(Integer id);

	// update of particular customer by id

	Shopping updateOfShoppingById(Integer id);

	// Delete of Product
	void deleteShoppingById(Integer id);

}