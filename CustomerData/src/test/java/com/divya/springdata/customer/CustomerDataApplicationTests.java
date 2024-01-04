package com.divya.springdata.customer;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.divya.springdata.customer.entity.Customer;
import com.divya.springdata.customer.repo.CustomerRepo;

@SpringBootTest
class CustomerDataApplicationTests {

	@Autowired
	CustomerRepo repo;
	
	@Test
	public void testCreate()
	{
		//Data 1
		Customer cust=new Customer();
		cust.setId(1);
		cust.setName("Shalu");
		cust.setEmail("Shalu21@gmail.com");
		
		repo.save(cust);
		
		//Data 2
		Customer cust2=new Customer();
		cust2.setId(2);
		cust2.setName("Vijay Duke");
		cust2.setEmail("VijayDuke@gmail.com");
		
		//Data 3
		Customer cust3 = new Customer();
		cust3.setId(3);
		cust3.setName("Vibitha");
		cust3.setEmail("vibitha@gmail.com");
		repo.saveAll(List.of(cust2,cust3));
	}
	
	@Test
	public void testRead()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>" + repo.findAll() );
		Optional<Customer> cust=repo.findById(2);
		System.out.println("+++++++++++++++ ID 2 : "+cust);
		System.out.println("*************** Prints only ID 1 and 2 " + repo.findAllById(List.of(1,2)));
		
	}
	
	@Test
	public void testUpdate()
	{
		Customer cust=repo.findById(3).get();
		System.out.println("********* Before data Change "+cust);
		cust.setEmail("ponvandu@gmail.com");
		repo.save(cust);
		 cust=repo.findById(3).get();
		System.out.println("********* After data Change "+cust);
	}

}
