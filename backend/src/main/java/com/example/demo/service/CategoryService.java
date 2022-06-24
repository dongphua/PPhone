package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Category;

@Service
public interface CategoryService {

	public List<Category> findAllCategory();

	public List<Category> findCategoryByName(String category_name);

	public void insertNewCategory(String category_name);

	public void editCategory(@PathVariable int category_id, String category_name);
}