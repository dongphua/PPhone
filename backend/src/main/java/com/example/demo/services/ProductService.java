package com.example.demo.services;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;

@Service
public interface ProductService {
     
	 public void insertNewProduct(Product product, MultipartFile multipartFile) throws IOException;
	 
		public List<Product> findAllProduct();
		public List<Product> findProductByName(String product_name);
		
		public List<Category> findProductById(int product_id);
		

		public Product editProduct(int product_id, Product product);
}