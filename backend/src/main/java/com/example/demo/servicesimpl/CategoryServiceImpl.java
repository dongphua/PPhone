package com.example.demo.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.services.CategoryService;

@Component
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAllCategory() {
		return categoryRepository.findAllCategory();
	}

	@Override
	public List<Category> findCategoryByName(String category_name) {
		return categoryRepository.findCategoryByName(category_name);
	}

	@Override
	public Category insertNewCategory(String category_name) {
		Category category = new Category();
		category.setCategoryName(category_name);
		return categoryRepository.save(category);
	}

	@Override
	public Category editCategoryName(int category_id, String category_name) {
		Category category = categoryRepository.getReferenceById(category_id);
		category.setCategoryName(category_name);
		return categoryRepository.save(category);
	}
}