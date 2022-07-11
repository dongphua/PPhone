package com.example.demo.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.services.CategoryService;


@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}
	
	@Override
	public List<Category> findAllCategory() {
		return categoryRepository.findAllCategory();
	}

	@Override
	public List<Category> findCategoryByName(String category_name) {
		return categoryRepository.findCategoryByName(category_name);
	}
	
	@Override
	public List<Category> findCategoryById(int category_id) {
		return categoryRepository.findCategoryById(category_id);
	}

	@Override
	public void insertNewCategory(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public void editCategoryName(int category_id, Category category) {
		Optional<Category> categoryOptional = categoryRepository.findById(category_id);
		Category categoryEdit = categoryOptional.get();
		categoryRepository.save(categoryEdit);
	}

}