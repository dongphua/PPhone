package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	@Column(name = "category_name")
	private String category_name;
//	@OneToMany(mappedBy = "category")
//	private List<Product> product;

	public Category() {

	}

	public Category(String category_name) {
		this.category_name = category_name;
	}

	public int getCategoryId() {
		return category_id;
	}

	public String getCategoryName() {
		return category_name;
	}

	public void setCategoryName(String category_name) {
		this.category_name = category_name;
	}

//	public List<Product> getProduct() {
//		return product;
//	}

//	public void setEmployees(List<Product> product) {
//		this.product = product;
//	}
}