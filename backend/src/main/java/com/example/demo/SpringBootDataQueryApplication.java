package com.example.demo;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.models.Category;
import com.example.demo.repositories.CategoryRepository;

import lombok.RequiredArgsConstructor;


@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootDataQueryApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDataQueryApplication.class, args);
        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);

  //      System.out.println("__________Demo find all order by name desc________________");
//        List<Category> category = categoryRepository.findAll();
   //     category.forEach(e -> System.out.println(e.getCategoryName()));
  //      categoryRepository.save(new Category("Charlie"));
  //      category = categoryRepository.findAll();
   //     category.forEach(e -> System.out.println(e.getCategoryName()));
    }
}