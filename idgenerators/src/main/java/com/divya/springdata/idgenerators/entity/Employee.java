package com.divya.springdata.idgenerators.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Employee {

	//@TableGenerator(name="employee_gen", table="id_generation" , pkColumnName="gen_name",
			//valueColumnName="gen_value", allocationSize=100)
	@GenericGenerator(name="emp_id", strategy="com.divya.springdata.idgenerators.CustomRandomIdGenerator")
	@GeneratedValue(generator = "emp_id")
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@GeneratedValue(strategy=GenerationType.TABLE, generator = "employee_gen")
	
	private int id;
	private String name;
	
	
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
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
