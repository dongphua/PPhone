package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;

@Service
public class ProductService {
     
	public List<Product> findAllProducts() {
		Product car1 = new Product();
		Product car2 = new Product();
		Product car3 = new Product();
		car1.setProduct_id(1);
		car1.setProduct_name("Car1");
		car1.setProduct_price(50000);
		car2.setProduct_id(2);
		car2.setProduct_name("Car2");
		car2.setProduct_price(60000);
		car3.setProduct_id(3);
		car3.setProduct_name("Car3");
		car3.setProduct_price(70000);
		return List.of(car1,car2,car3);
	}
	
	public List<Product> getLessThan60000Products(List<Product> products) {
		return products.stream()
				.filter(product -> product.getProduct_price()<60000)
				.collect(Collectors.toList());
	}
	
}