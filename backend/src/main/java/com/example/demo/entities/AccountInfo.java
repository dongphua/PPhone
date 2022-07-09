package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity

public class AccountInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "accountinfo_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountinfo_id;
	@Column(name = "accountinfo_name")
	private String accountinfo_name;
	@Column(name = "accountinfo_phone")
	private String accountinfo_phone;
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	public AccountInfo() {

	}
	
	public AccountInfo(String accountinfo_name, String accountinfo_phone) {
		this.accountinfo_name = accountinfo_name;
		this.accountinfo_phone = accountinfo_phone;
	}

	public int getAccountInfoId() {
		return accountinfo_id;
	}

	public void setAccountInfoId(int accountinfo_id) {
		this.accountinfo_id = accountinfo_id;
	}

	public String getAccountInfoName() {
		return accountinfo_name;
	}

	public void setAccountInfoName(String accountinfo_name) {
		this.accountinfo_name = accountinfo_name;
	}

	public String getAccountInfoPhone() {
		return accountinfo_phone;
	}

	public void setAccountInfoPhone(String accountinfo_phone) {
		this.accountinfo_phone = accountinfo_phone;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}





}