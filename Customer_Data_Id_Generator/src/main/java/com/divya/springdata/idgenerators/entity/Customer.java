package com.divya.springdata.idgenerators.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	
	@Id
	private int id;
	private String name;
	//@Column(name="email")
	private String mail;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
	
	
	
	
}
