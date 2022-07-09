package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity

public class Review implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "review_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int review_id;
	@Column(name = "review_name")
	private String review_name;
	@ManyToOne

	@JoinColumn(name = "product_id")
	private Product product;
	
	@JoinColumn(name = "account_id")
	private Account account;
	

	public Review() {

	}



	public Review(int review_id, String review_name) {
		this.review_id = review_id;
		this.review_name = review_name;
	}



	public int getReviewId() {
		return review_id;
	}



	public void setReviewId(int review_id) {
		this.review_id = review_id;
	}



	public String getReviewName() {
		return review_name;
	}



	public void setReviewName(String review_name) {
		this.review_name = review_name;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}




}