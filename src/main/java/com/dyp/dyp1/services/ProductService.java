package com.dyp.dyp1.services;

import java.util.List;
import java.util.Optional;

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
	
	public Optional<Product> getProduct(Long id) {
		return pro_Repo.findById(id);
	}
	
	public Product updateProduct(Product new_Pro) {
		Product old_Pro = pro_Repo.getById(new_Pro.getId());
		
		old_Pro.setName(new_Pro.getName());
		old_Pro.setDescription(new_Pro.getDescription());
		old_Pro.setPrice(new_Pro.getPrice());
		old_Pro.setStock(new_Pro.getStock());
		
		pro_Repo.save(old_Pro);
		return old_Pro;
	}
	
	public void deletePro(Long id) {
		pro_Repo.deleteById(id);
	}
}




















