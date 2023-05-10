package com.divya.database.databasedemo.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.divya.database.databasedemo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJPARepository {

	//connect to Database
	//Manages entities  - All operations are going through persistance context
	@PersistenceContext
	EntityManager entityManager;
	
	//Method to find all Data
	public List<Person> findall()
	{
		TypedQuery<Person> namedQuery= entityManager.createNamedQuery("find_all_persons",Person.class);
		return namedQuery.getResultList();
	}
	
	public Person findById(int id)
	{
		return entityManager.find(Person.class, id);
				
				
	}
	//Update
	public Person update(Person person)
	{
		return entityManager.merge(person);
				
				
	}
	//Insert
		public Person insert(Person person)
		{
			return entityManager.merge(person);
					
					
		}
		
		//delete
		public void delete(int id)
		{
			Person person=findById(id);
		entityManager.remove(person);
		
		}
		
		
	
}
