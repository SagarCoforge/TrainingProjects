package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;

public class OrderServiceImpl implements OrderService {
OrderRepository orderRepositary;
	@Override
	public Order CreatOrderDetails(Order order) {
		return orderRepositary.save(order);
	}

	@Override
	public Order addOrderDetails(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> ListOfOrder(Order order) {
		List<Order> listOforder = orderRepositary.findAll();

		return listOforder;
	}

	@Override
	public void deleteOrder(Long orderid) {
		orderRepositary.deleteById(orderid);
		
	}
	@Override
	public Optional<Order> getOrderById(long id) {

		Optional<Order> order = orderRepositary.findById(id);

		return order;
	}


	@Override
	public Order updateOfOrderById(Long orderid) {
		Order order=null;
		try {
			 order = orderRepositary.findById(orderid)
					.orElseThrow(() -> new Exception("Order not found for this id :: " + orderid));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;

	}

}
