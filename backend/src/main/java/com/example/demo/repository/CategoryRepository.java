package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	@Autowired
	public static final CategoryRepository categoryRepository = null;
	  @Query(value = "SELECT * FROM category",nativeQuery=true)
	  List<Category> findAllCategory();
	  
	  @Query(value = "INSERT INTO category(category_name) VALUES (?1)", nativeQuery = true)
	  List<Category> insertNewCategory(String category_name);
}