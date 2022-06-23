package com.example.demo.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Category;
import com.example.demo.repositories.CategoryRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@RestController
public class Controller {

    @Autowired
    private CategoryRepository categoryRepository;
    

	@GetMapping("/api/category")
	public List<Category> findAllCategory() {
		return categoryRepository.findAll();
	}
	
	@GetMapping("/api/category/{category_name}")
	public List<Category> findCategoryByName(@PathVariable String category_name) {
		return categoryRepository.findCategoryByName(category_name);
	}
	
	
	@PostMapping("/api/category/{category_name}")
	public void insertNewCategory(@PathVariable String category_name) {
		Category category = new Category();
		category.setCategoryName(category_name);
		categoryRepository.save(category);
	}
	
	@PutMapping("/api/category/{category_id}")
	public void editCategory(@PathVariable int category_id, String category_name) {
		Category category = categoryRepository.getReferenceById(category_id);
		category.setCategoryName(category_name);
		categoryRepository.save(category);
	}
}