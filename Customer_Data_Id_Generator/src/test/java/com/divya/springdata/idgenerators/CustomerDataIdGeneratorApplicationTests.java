package com.divya.springdata.idgenerators;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.divya.springdata.idgenerators.entity.Customer;
import com.divya.springdata.idgenerators.repo.CustomerRepo;

@SpringBootTest
class CustomerDataIdGeneratorApplicationTests {

	@Autowired
	CustomerRepo repo;
	
	@Test
	void contextLoads() {
	}

	//Manual ID Insertion
	@Test
	public void test_CreateData_Manual_ID()
	{
		Customer cust=new Customer();
		cust.setId(123);
		cust.setName("I Am Happy");
		cust.setMail("thankgod@gmail.com");
		repo.save(cust);
		
	}
	
	//With Generation Type Auto ID Insertion
	
	@Test
	public void test_Createdata_AutoID()
	{
		Customer cust=new Customer();
		cust.setName("Ram");
		cust.setMail("ram@gmail.com");
		repo.save(cust);
	}
}
