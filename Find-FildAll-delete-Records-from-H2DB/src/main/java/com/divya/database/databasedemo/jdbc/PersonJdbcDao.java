package com.divya.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.divya.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {

	//To connect with Db in spring
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Person> findAll()
	{
		return jdbcTemplate.query("Select * from Person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	//@SuppressWarnings("deprecation")
	public Person findById(int id)
	{
		return jdbcTemplate.queryForObject("Select * from person where id=?",
				new BeanPropertyRowMapper<Person>(Person.class), new Object[] {id});
				
				
	}
	//delete by id - returns a number
	public int deleteById(int id)
	{
		return jdbcTemplate.update("delete from person where id=?",
				 new Object[] {id});			
				
	}
	
	public int deleteByLocation(String location)
	{
		return jdbcTemplate.update("delete from person where location=?",
				 new Object[] {location});			
				
	}
}
