package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id

	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	@Column(name = "category_name")
	private String category_name;
	@OneToMany(mappedBy = "category")
	private List<Product> product;

}