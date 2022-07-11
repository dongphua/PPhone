package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	@Autowired
	public static final CategoryRepository categoryRepository = null;

	@Query(value = "SELECT category_id,category_name FROM category ORDER BY category_id", nativeQuery = true)
	List<Category> findAllCategory();
	
	@Query(value = "SELECT * FROM category WHERE category_name= :category_name", nativeQuery = true)
	List<Category> findCategoryByName(@Param("category_name") String category_name);
	
	@Query(value = "SELECT * FROM category WHERE category_id= :category_id", nativeQuery = true)
	List<Category> findCategoryById(@Param("category_id") int category_id);

	@Query(value = "INSERT INTO category(category_name) VALUES (:category_name)", nativeQuery = true)
	Category insertNewCategory(@Param("category_name") String category_name);

	@Query(value = "UPDATE category SET category_name= :category_name WHERE category_id= :category_id", nativeQuery = true)
	Category editCategoryName(@Param("category_name") String category_name, @Param("category_id") int category_id);

}