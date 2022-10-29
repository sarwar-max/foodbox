package com.main.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.main.fallback.ProductServiceFallback;
import com.main.model.Product;

@FeignClient(name = "FOODBOX-PROVIDER", fallback = ProductServiceFallback.class)
public interface ProductServiceProxy {

	@GetMapping(value = "/getAllProducts", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProducts();
	
	@GetMapping(value = "/getAllProducts/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Product getProductById(@PathVariable("id") Integer id);
}
