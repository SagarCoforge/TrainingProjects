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

import com.example.demo.pojo.Order;
import com.example.demo.serviceImpl.OrderServiceImpl;

@RestController
@RequestMapping("/vi/api")
public class OrderController {
	@Autowired
	OrderServiceImpl orderServiceImpl;
	
	
	@PostMapping("/createorder")
	Order createOrderDetails(@RequestBody Order orderinfo) {

Order orderinf=orderServiceImpl.CreatOrderDetails(orderinfo);
return orderinf;
	}
	
	// api for get order list
		@GetMapping("/listoforder")
		public List<Order> listOfOrders(Order order) {

			List<Order> listOfOrdersdetails = orderServiceImpl.ListOfOrder(order);

			return listOfOrdersdetails;
		}

		// api for delete order by id
		@DeleteMapping("/orderdeletedbyid/{id}")
		public Map<String,Boolean> deleteById(@PathVariable(value = "id") Long id) {
		      Map<String,Boolean> response = new HashMap<>();
			
			Optional<Order> prod = orderServiceImpl.getOrderById(id);
			
			if(prod!=null) {
				orderServiceImpl.deleteOrder(id);
				response.put("deleted", Boolean.TRUE);
				return response;
			}
				
				response.put(" not deleted", Boolean.FALSE);
				return response;
		}

	

}
