package com.example.demo.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

@Service
@Transactional
public interface CategoryService {
     
	public List<Category> findAllCategory();
	
	public List<Category> findCategoryByName(String category_name);

	public void insertNewCategory(Category category);

	public Category editCategoryName(int category_id, String category_name);
}