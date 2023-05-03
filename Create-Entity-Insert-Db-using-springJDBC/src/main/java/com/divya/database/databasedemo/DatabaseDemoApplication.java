package com.divya.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.divya.database.databasedemo.jdbc.PersonJdbcDao;


//Implement Command Line Runner
@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{

	@Autowired
	PersonJdbcDao dao;
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
		//Implement Command Line Runner
		
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Users ->{}",dao.findAll());
	}

}
