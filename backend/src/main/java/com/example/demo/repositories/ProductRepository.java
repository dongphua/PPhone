package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Autowired
	public static final ProductRepository productRepository = null;
	
	@Query(value = "SELECT * FROM product ORDER BY product_id", nativeQuery = true)
	List<Product> findAllProduct();
	
	@Query(value = "SELECT * FROM product ORDER BY product_id", nativeQuery = true)
	List<Product> findAllProduct();
}