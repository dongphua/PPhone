package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

public class Category implements Serializable{
  private static final long serialVersionUID = 1L;
  @Id
  @Column(name = "category_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int category_id;
  @Column(name = "category_name")
  private String category_name;

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
}