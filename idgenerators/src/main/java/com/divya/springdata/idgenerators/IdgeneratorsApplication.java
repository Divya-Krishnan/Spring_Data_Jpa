package com.divya.springdata.idgenerators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
//@ComponentScan("com.divya.springdata.idgenerators")
public class IdgeneratorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdgeneratorsApplication.class, args);
	}

}
