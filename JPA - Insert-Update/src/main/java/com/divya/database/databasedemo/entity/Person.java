package com.divya.database.databasedemo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//To mention Table name Explicitly - Not needed bcoz my table name is similar to class name
@Table(name="person")
public class Person {

	//To specify primary key
	@Id
	@GeneratedValue
	private int id;
	
	//To mention column name explicitly - Not needed bcoz my column name is similar to field name
	@Column(name="Name")
	private String name;
	
	private String location;
	
	private Date birthDate;
	
	//When we use bean row mapper we need this
	//default constructor
	public Person() {}
	
	//ID is auto Generated , there is no need of mentioning explicitly
	public Person( String name, String location, Date birthDate) {
		super();
		//this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public Person(String location, Date birthDate, int id,String name) {
		super();
		this.id = id;
		this.location = location;
		this.birthDate = birthDate;
		this.name=name;
	}
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getbirthDate() {
		return birthDate;
	}
	public void setbirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}
	
	
}
