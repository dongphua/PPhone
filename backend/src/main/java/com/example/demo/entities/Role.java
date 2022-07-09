package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity

public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;
	@Column(name = "role_name")
	private String role_name;
	@OneToMany(mappedBy = "role")
	private List<Role> role;

	public Role() {

	}

	public Role(String role_name) {
		this.role_name = role_name;
	}

	public int getRoleId() {
		return role_id;
	}

	public String getRoleName() {
		return role_name;
	}

	public void setRoleName(String role_name) {
		this.role_name = role_name;
	}

	public List<Role> getRole() {
		return role;
	}

}