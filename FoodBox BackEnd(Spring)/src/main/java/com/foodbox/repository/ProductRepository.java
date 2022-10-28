package com.foodbox.repository;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodbox.model.Product;

@Repository("productRepository")
@Scope("singleton")
public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
