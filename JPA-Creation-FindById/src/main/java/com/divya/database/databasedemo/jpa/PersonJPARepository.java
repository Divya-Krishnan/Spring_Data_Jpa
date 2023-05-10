package com.divya.database.databasedemo.jpa;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.divya.database.databasedemo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJPARepository {

	//connect to Database
	//Manages entities  - All operations are going through persistance context
	@PersistenceContext
	EntityManager entityManager;
	public Person findById(int id)
	{
		return entityManager.find(Person.class, id);
				
				
	}
	
	
	
}
