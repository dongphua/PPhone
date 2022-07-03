package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Category;

public interface CategoryService {
     
	public List<Category> findAllCategory();
	
	public List<Category> findCategoryByName(@PathVariable String category_name);
	
	public void insertNewCategory(@PathVariable String category_name);
	
	public void editCategory(@PathVariable int category_id, String category_name);
	
}