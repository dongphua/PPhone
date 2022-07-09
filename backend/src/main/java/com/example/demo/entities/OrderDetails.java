
package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity

public class OrderDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "orderdt_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderdt_id;

	@Column(name = "orderdt_name")
	private String orderdt_name;

	@Column(name = "orderdt_quantity")
	private int orderdt_quantity;

	@ManyToOne

	@JoinColumn(name = "account_id")
	private Account account;

	public OrderDetails() {

	}

	public OrderDetails(String orderdt_name, int orderdt_quantity) {
		this.orderdt_name = orderdt_name;
		this.orderdt_quantity = orderdt_quantity;
	}

	public int getOrderdtId() {
		return orderdt_id;
	}

	public void setOrderdtId(int orderdt_id) {
		this.orderdt_id = orderdt_id;
	}

	public String getOrderdtName() {
		return orderdt_name;
	}

	public void setOrderdtName(String orderdt_name) {
		this.orderdt_name = orderdt_name;
	}

	public int getOrderdtQuantity() {
		return orderdt_quantity;
	}

	public void setOrderdtQuantity(int orderdt_quantity) {
		this.orderdt_quantity = orderdt_quantity;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}



}
