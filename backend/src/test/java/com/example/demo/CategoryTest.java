package com.example.demo;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.servicesimpl.CategoryServiceImpl;


public class CategoryTest {

    CategoryServiceImpl categoryServiceImpl;
    CategoryRepository categoryRepository;
    Category initialCategory;
    Category expectedCategory;

    @BeforeEach
    void beforeEach() {
    	categoryRepository = mock(CategoryRepository.class);
    	categoryServiceImpl = new CategoryServiceImpl();
//		initialUser = UserEntity.builder().id(1L).firstName("firstName").lastName("lastName")
//				.fullName("fullName").build();
//		expectedUser = initialUser.toBuilder().firstName("Huy").lastName("Nguyen").fullName("Huy Nguyen").build();
        initialCategory = mock(Category.class);
        expectedCategory = mock(Category.class);
        when(categoryRepository.findById((int) 1L)).thenReturn(Optional.of(initialCategory));
        when(categoryRepository.save(initialCategory)).thenReturn(expectedCategory);
    }

    @Test
    void changeUserName_ShouldReturnUser_WhenDataValid() {
//        UserEntity result = userServiceImpl.changeUserName(1L, "Huy", "Nguyen");
////		ArgumentCaptor<UserEntity> userCaptor = ArgumentCaptor.forClass(UserEntity.class);
////		verify(userRepository).save(userCaptor.capture());
////		UserEntity updatedUser = userCaptor.getValue();
////		assertThat(updatedUser.getFullName(), is("sfsdfsdf Nguyen"));
////		assertThat(updatedUser.getFirstName(), is("sfsdfsdf"));
////		assertThat(updatedUser.getLastName(), is(expectedUser.getLastName()));
//        verify(initialUser).setFirstName("Huy");
//        verify(initialUser).setLastName("Nguyen");
//        verify(initialUser).setFullName("Huy Nguyen");
//        assertThat(result, is(expectedUser));
    }

    @Test
    void getAllCategory_ShouldReturnAllCategory() {
		Category category1 = new Category("Alpha");
		Category category2 = new Category("Beta");
		Category category3 = new Category("Charlie");
		List<Category> allCategory = List.of(category1,category2,category3);
        assertThat(allCategory, is(3));
    }

}
