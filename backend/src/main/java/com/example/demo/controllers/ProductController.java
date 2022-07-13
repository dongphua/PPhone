package com.example.demo.controllers;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.services.CategoryService;
import com.example.demo.services.ProductService;


@RestController
@RequestMapping(produces="application/json")
@CrossOrigin(origins="*")
public class ProductController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired

	private ProductService productService;

	@RequestMapping(value = { "/api/product" }, method = RequestMethod.GET)
	public List<Product> findAllProduct() {
		return productService.findAllProduct();
	}

//	@RequestMapping(value = { "/api/category/categoryname/{category_name}" }, method = RequestMethod.GET)
//	public List<Category> findCategoryByName(@PathVariable String category_name) {
//		return categoryService.findCategoryByName(category_name);
//	}
//	
//	@RequestMapping(value = { "/api/category/categoryid/{category_id}" }, method = RequestMethod.GET)
//	public List<Category> findCategoryById(@PathVariable int category_id) {
//		return categoryService.findCategoryById(category_id);
//	}
//
//	@RequestMapping(value = { "/api/category" }, method = RequestMethod.POST)
//	@ResponseBody
//	public void insertNewCategory(@RequestBody Category category) {
//		categoryService.insertNewCategory(category);
//	}
//
//	@RequestMapping(value = { "/api/category/{category_id}" }, method = RequestMethod.PUT)
//	@ResponseBody
//	public void editCategoryName(@PathVariable int category_id, @RequestBody Category category) {
//		categoryService.editCategoryName(category_id, category);
//	}
	
}