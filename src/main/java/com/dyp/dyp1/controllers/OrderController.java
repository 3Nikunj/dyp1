package com.dyp.dyp1.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyp.dyp1.dto.OrderDTO;
import com.dyp.dyp1.entity.Order;
import com.dyp.dyp1.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService ord_serv;
	
	@GetMapping("/getAll")
	public List<Order> getAllOrders(){
		return ord_serv.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Order> getOrder(@PathVariable Long id){
		return ord_serv.getById(id);
	}
	
	@PostMapping("/save")
	public String makeOrder(@RequestBody OrderDTO dto) {
		ord_serv.saveOrd(dto);
		return "Order marked successfully!";
	}
}

























