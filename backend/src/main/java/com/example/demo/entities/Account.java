package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "account_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int account_id;
	@Column(name = "account_email")
	private String account_email;
	@Column(name = "account_password")
	private String account_password;
	@Column(name = "account_createat")
	private String account_createat;
	@Column(name = "account_updateat")
	private String account_updateat;
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	public Account() {

	}

	public Account(String account_email, String account_password, String account_createat,
			String account_updateat) {
		this.account_email = account_email;
		this.account_password = account_password;
		this.account_createat = account_createat;
		this.account_updateat = account_updateat;
	}
	
	public int getAccountId() {
		return account_id;
	}

	public void setAccountId(int account_id) {
		this.account_id = account_id;
	}

	public String getAccountEmail() {
		return account_email;
	}

	public void setAccountEmail(String account_email) {
		this.account_email = account_email;
	}

	public String getAccountPassword() {
		return account_password;
	}

	public void setAccountPassword(String account_password) {
		this.account_password = account_password;
	}

	public String getAccountCreateAt() {
		return account_createat;
	}

	public void setAccountCreateAt(String account_createat) {
		this.account_createat = account_createat;
	}

	public String getAccountUpdateAt() {
		return account_updateat;
	}

	public void setAccountUpdateAt(String account_updateat) {
		this.account_updateat = account_updateat;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}





}