package com.capgemini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class RegisterModel implements Serializable {
	private static final long serialVersionUID = -770804126346313076L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "contact")
	private Integer contact;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getContact() {
		return contact;
	}

	public void setContact(Integer contact) {
		this.contact = contact;
	}
	
	
	
	
} 	
