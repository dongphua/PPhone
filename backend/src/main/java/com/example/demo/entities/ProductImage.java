
package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity

public class ProductImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "producimage_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productimage_id;

	@Column(name = "product_url")
	private String productimage_url;

	@ManyToOne

	@JoinColumn(name = "product_id")
	private Product product;

	public ProductImage() {

	}

	
	public ProductImage(int productimage_id, String productimage_url) {
		this.productimage_id = productimage_id;
		this.productimage_url = productimage_url;
	}


	public int getProductimage_id() {
		return productimage_id;
	}

	public void setProductimage_id(int productimage_id) {
		this.productimage_id = productimage_id;
	}

	public String getProductimage_url() {
		return productimage_url;
	}

	public void setProductimage_url(String productimage_url) {
		this.productimage_url = productimage_url;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	




	
}
