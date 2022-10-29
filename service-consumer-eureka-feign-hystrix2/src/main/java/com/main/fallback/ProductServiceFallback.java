package com.main.fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.main.model.Product;
import com.main.proxy.ProductServiceProxy;

@Component
public class ProductServiceFallback implements ProductServiceProxy {

	@Override
	public List<Product> getAllProducts() {
		return Arrays.asList(new Product());
	}

	@Override
	public Product getProductById(Integer id) {
		return new Product(id, "chole bhature", "Chole", "Indian", 101, 0, 0, "yes", "");
	}

	

}
