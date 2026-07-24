package com.dyp.dyp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyp.dyp1.dto.OrderDTO;
import com.dyp.dyp1.entity.Customer;
import com.dyp.dyp1.entity.Order;
import com.dyp.dyp1.entity.Product;
import com.dyp.dyp1.repositories.CustomerRepo;
import com.dyp.dyp1.repositories.OrderRepo;
import com.dyp.dyp1.repositories.ProductRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo ord_repo;
	
	@Autowired
	private ProductRepo pro_repo;
	
	@Autowired
	private CustomerRepo cust_repo;
	
	public List<Order> getAll(){
		return ord_repo.findAll();
	}
	
	public Optional<Order> getById(Long id){
		return ord_repo.findById(id);
	}
	
	public void saveOrd(OrderDTO dto) {
		Long pro_id = dto.getProductId();
		Long cust_id = dto.getCustomerId();
		
		Product pro = pro_repo.getById(pro_id);
		Customer cust = cust_repo.getById(cust_id);
		
		Order ord = new Order();
		ord.setQuantity(dto.getQuatity());
		ord.setTotal_payment(dto.getQuatity() * pro.getPrice());
		ord.setCutomer(cust);
		ord.setProduct(pro);
		
		ord_repo.save(ord);
		
	}
}








