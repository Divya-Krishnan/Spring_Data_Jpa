package com.divya.springdata.idgenerators;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.divya.springdata.idgenerators.entity.Employee;
import com.divya.springdata.idgenerators.repo.EmployeeRepository;

@SpringBootTest
class IdgeneratorsApplicationTests {
	/*
	 * @Autowired EmployeeRepository repo;
	 */

	@Autowired
	EmployeeRepository repo;

	@Test
	void contextLoads() {

	}

	// Manually Assigned ID Values

	@Test

	public void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Amrutha");
		repo.save(employee);
	}

	/*
	 * FOR AUTO INCREMENT We need to create this in SQL create table employee( id
	 * int PRIMARY KEY AUTO_INCREMENT, name varchar(20) )
	 */

	@Test

	public void testCreateEmployee_withAutoIdGen() {
		Employee employee = new Employee();
		employee.setName("Ezhil");
		repo.save(employee);
	}

}
