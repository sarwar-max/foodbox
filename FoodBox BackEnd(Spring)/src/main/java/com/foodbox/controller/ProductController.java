package com.foodbox.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodbox.model.Product;
import com.foodbox.service.IProductService;

@RestController
@Scope("request")
public class ProductController {

	@Autowired
	@Qualifier("productService")
	private IProductService productService;
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}

	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productService.save(product);
	}

	@DeleteMapping("/deletById/{id}")
	public void deletById(@PathVariable Integer id) {
		productService.delete(id);
	}
	

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productService.save(product);
	}
	

}