package com.dyp.dyp1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyp.dyp1.entity.Product;
import com.dyp.dyp1.repositories.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo pro_Repo;

	public void save_product(Product product) {
		pro_Repo.save(product);
	}
	
	public List<Product> getAllProducts(){
		return pro_Repo.findAll();
	}
}
