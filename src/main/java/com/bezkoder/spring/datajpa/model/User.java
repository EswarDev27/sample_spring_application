package com.bezkoder.spring.datajpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "news")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
//	@Column(name = "phone")
//	private int phone;
//	
//	@Column(name = "createdAt")
//	private Date createdAt;
	
	public User(String name,
			String email
//			int phone
			) {
		this.name = name;
		this.email = email;
//		this.phone = phone;
//		this.createdAt = createdAt ;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public int getPhone() {
//		return phone;
//	}
//
//	public void setPhone(int phone) {
//		this.phone = phone;
//	}
//
//	public Date getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(Date createdAt) {
//		this.createdAt = createdAt;
//	}


}

