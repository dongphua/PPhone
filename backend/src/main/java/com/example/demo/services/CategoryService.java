package com.example.demo.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

@Service
public interface CategoryService {
     
	public List<Category> findAllCategory();
	
	public List<Category> findCategoryByName(String category_name);
	
	public List<Category> findCategoryById(int category_id);
	
	public void insertNewCategory(Category category);

	public void editCategoryName(int category_id, Category category);


}