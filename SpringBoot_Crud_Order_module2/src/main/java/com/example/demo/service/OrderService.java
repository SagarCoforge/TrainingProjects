package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Order;

public interface OrderService {

	Order CreatOrderDetails(Order order); ///done
	
	// add for product
	Order addOrderDetails(Order order);  //ignore it

		// list of all products

		List<Order> ListOfOrder(Order order);  //done
		// Delete of Product

		void deleteOrder(Long orderid); //done

		// view of particular Product by id

	    Optional<Order> getOrderById(long id);  //done

		// update of particular Product by id

		Order updateOfOrderById(Long orderid); //done
	

}
