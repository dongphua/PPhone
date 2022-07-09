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
		car1.setProductId(1);
		car1.setProductName("Car1");
		car1.setProductPrice(50000);
		car2.setProductId(2);
		car2.setProductName("Car2");
		car2.setProductPrice(60000);
		car3.setProductId(3);
		car3.setProductName("Car3");
		car3.setProductPrice(70000);
		List<Product> allProducts = List.of(car1,car2,car3);

	}

}
