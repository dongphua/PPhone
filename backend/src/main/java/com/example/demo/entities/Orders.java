
package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity

public class Orders implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "orders_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orders_id;

	@Column(name = "orders_date")
	private Timestamp orders_date;

	@Column(name = "orders_total")
	private Double orders_total;

	@ManyToOne

	@JoinColumn(name = "account_id")
	private Account account;

	public Orders() {

	}

	public Orders(Timestamp orders_date, Double orders_total) {
		this.orders_date = orders_date;
		this.orders_total = orders_total;
	}

	public int getOrders_id() {
		return orders_id;
	}

	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}

	public Timestamp getOrders_date() {
		return orders_date;
	}

	public void setOrders_date(Timestamp orders_date) {
		this.orders_date = orders_date;
	}

	public Double getOrders_total() {
		return orders_total;
	}

	public void setOrders_total(Double orders_total) {
		this.orders_total = orders_total;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


}
