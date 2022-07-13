package com.example.demo;

import static org.hamcrest.Matchers.is;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.services.CategoryService;
import com.example.demo.servicesimpl.CategoryServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CategoryServiceTest {
	@Mock
	CategoryRepository categoryRepository;
	@InjectMocks
	CategoryServiceImpl categoryServiceImpl;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void getCategory_ShouldReturnList_WhenDataValid() {
		List<Category> list = new ArrayList<>();
			Category mock1 = new Category("Alpha");
			categoryRepository.save(mock1);
		when(categoryRepository.findAllCategory()).thenReturn(list);
		
		List<Category> result = categoryServiceImpl.findAllCategory();
		
		assertThat(result.size()).isEqualTo(1);
		
		verify(categoryRepository).findAllCategory();
	}
	
	

	
}