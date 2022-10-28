package com.foodbox.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.foodbox.model.Product;
import com.foodbox.repository.ProductRepository;

@Service("productService")
@Scope("singleton")
@Transactional
public class ProductService implements IProductService {

	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;
	
	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void delete(int id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

}
