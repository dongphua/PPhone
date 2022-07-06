package com.example.demo.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductServiceTest {
	
	@Autowired
	private ProductService productService;
	
	@Test
	public void testGetLessThan60000Products_GivenListOfProducts_ShouldReturnLessThan60000Products() {
		Product car1 = new Product();
		Product car2 = new Product();
		Product car3 = new Product();
		car1.setProduct_id(1);
		car1.setProduct_name("Car1");
		car1.setProduct_price(50000);
		car2.setProduct_id(2);
		car2.setProduct_name("Car2");
		car2.setProduct_price(60000);
		car3.setProduct_id(3);
		car3.setProduct_name("Car3");
		car3.setProduct_price(70000);
		List<Product> allProducts = List.of(car1,car2,car3);
		List<Product> lessThan60000Product = productService.getLessThan60000Products(allProducts);
		assertThat(lessThan60000Product).hasSize(1);
	}

}
