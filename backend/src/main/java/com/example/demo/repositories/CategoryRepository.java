package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	@Autowired
	public static final CategoryRepository categoryRepository = null;
	  
	  @Query(value = "SELECT * FROM category WHERE category_name= ?1",nativeQuery=true)
	  List<Category> findCategoryByName(String category_name);
	  
	  @Query(value = "INSERT INTO category(category_name) VALUES (?1)", nativeQuery = true)
	  Category insertNewCategory(@Param("category_name") String category_name);
	  
	  @Query(value = "UPDATE category SET category_name= ?1 WHERE category_id= ?2",nativeQuery=true)
	  Category editCategoryName(String category_name,@Param("category_id")int category_id);
}