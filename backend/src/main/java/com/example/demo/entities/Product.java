
package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "product_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;

	@Column(name = "product_name")
	private String product_name;

	@Column(name = "product_image")
	private String product_image;

	@Column(name = "product_price")
	private double product_price;

	@Column(name = "product_countinstock")
	private int product_countinstock;

	@Column(name = "product_isselling")
	private boolean product_isselling;

	@Column(name = "product_createat")
	private Timestamp product_createat;

	@Column(name = "product_updateat")
	private Timestamp product_updateat;

	@ManyToOne

	@JoinColumn(name = "category_id")
	private Category category;

	public Product() {

	}

	public int getProduct_id() {
		return product_id;
	}

	public Product(String product_name, String product_image, double product_price, int product_countinstock,
			boolean product_isselling, Timestamp product_createat, Timestamp product_updateat) {
		this.product_name = product_name;
		this.product_image = product_image;
		this.product_price = product_price;
		this.product_countinstock = product_countinstock;
		this.product_isselling = product_isselling;
		this.product_createat = product_createat;
		this.product_updateat = product_updateat;
	}

	public void setProductId(int product_id) {
		this.product_id = product_id;
	}

	public String getProductName() {
		return product_name;
	}

	public void setProductName(String product_name) {
		this.product_name = product_name;
	}

	public String getProductImage() {
		return product_image;
	}

	public void setProductImage(String product_image) {
		this.product_image = product_image;
	}

	public double getProductPrice() {
		return product_price;
	}

	public void setProductPrice(double product_price) {
		this.product_price = product_price;
	}

	public int getProductCountinstock() {
		return product_countinstock;
	}

	public void setProductCountinstock(int product_countinstock) {
		this.product_countinstock = product_countinstock;
	}

	public boolean isProductIsselling() {
		return product_isselling;
	}

	public void setProductIsselling(boolean product_isselling) {
		this.product_isselling = product_isselling;
	}

	public Timestamp getProductCreateat() {
		return product_createat;
	}

	public void setProductCreateat(Timestamp product_createat) {
		this.product_createat = product_createat;
	}

	public Timestamp getProductUpdateat() {
		return product_updateat;
	}

	public void setProductUpdateat(Timestamp product_updateat) {
		this.product_updateat = product_updateat;
	}

	public Category getCategory() {
		return category;
	}

	public void Category(Category category) {
		this.category = category;
	}
}
