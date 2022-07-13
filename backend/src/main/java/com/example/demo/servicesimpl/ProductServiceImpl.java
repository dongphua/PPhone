package com.example.demo.servicesimpl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.services.CategoryService;
import com.example.demo.services.ProductService;


@Transactional
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	   public void insertNewProduct(Product product, MultipartFile multipartFile) throws IOException {
	         
	        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
	        product.setProductImage(fileName);
	         
	        Product savedProduct =  productRepository.save(product);
	 
	        String uploadDir = "productphotos/" + savedProduct.getProduct_id();
	 
	        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
	         
	    }
	   
	@Override
	public List<Product> findAllProduct() {
		return productRepository.findAllProduct();
	}

//	@Override
//	public List<Product> findProductById(int product_id) {
//		return productRepository.findProductById(product_id);
//	}
//	
//	@Override
//	public List<Category> findCategoryById(int category_id) {
//		return categoryRepository.findCategoryById(category_id);
//	}
//
//	@Override
//	public void insertNewCategory(Category category) {
//		categoryRepository.save(category);
//	}
//
//	@Override
//	public void editCategoryName(int category_id, Category category) {
//		Category found = categoryRepository.getReferenceById(category_id);
//		found.setCategoryName(category.getCategoryName());
//		categoryRepository.save(found);
//	}

}