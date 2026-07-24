package com.dyp.dyp1.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyp.dyp1.entity.Product;
import com.dyp.dyp1.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService pro_serv;
	
	@PostMapping("/save")
	public String save(@RequestBody Product pro) {
		pro_serv.save_product(pro);
		return "Item stored successfully!";
	}
	
	@GetMapping("/get/{id}")
	public Optional<Product> getProduct(@PathVariable Long id) {
		return pro_serv.getProduct(id);
	}
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return pro_serv.getAllProducts();
	}
	
	@PutMapping("/update")
	public Product update(@RequestBody Product pro) {
		return pro_serv.updateProduct(pro);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		pro_serv.deletePro(id);
		return "Item deleted successfully!";
	}

}
