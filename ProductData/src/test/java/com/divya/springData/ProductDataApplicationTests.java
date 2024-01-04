package com.divya.springData;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.divya.springData.entities.Product;
import com.divya.springData.repos.ProductRepository;
//import org.springframework.boot.test.context.SpringBootTest;
//@ContextConfiguration(classes = ProductDataApplication.class, loader = AnnotationConfigContextLoader.class)
//@RunWith(SpringRunner.class)
//@DataJpaTest
@SpringBootTest
//@SpringBootTest(properties = "spring.main.lazy-initialization=true",
//classes = {ProductDataApplication.class})

class ProductDataApplicationTests {

	@Autowired
	ProductRepository pRepo;

	@Test
	void contextLoads() {

	}

	@Test
	public void testCreate()
	{
		Product product=new Product();
		product.setId(1);
		product.setName("Books");
		product.setDesc("Must Learn");
		product.setPrice(100D);
		pRepo.save(product);
		
		product.setId(2);
		product.setName("Ipad");
		product.setDesc("Awesome");
		product.setPrice(2000D);
		pRepo.save(product);
	}
	
	@Test
	public void testRead()
	{
		Product findById=pRepo.findById(1).get();
		assertNotNull(findById);
		assertEquals("Books", findById.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>"+findById);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> "+findById.getDesc());
		
		
	}
	
	@Test
	public void testUpdate()
	{
		
		Product prod=pRepo.findById(1).get();
		prod.setPrice(250D);
		pRepo.save(prod);
		
	}
	
	@Test
	public void testDelete()
	{
		if(pRepo.existsById(3))
		{
		pRepo.deleteById(3);
		}
		else
		{System.out.println("**************** No Such Record Found ****************");}
	}

	@Test
	public void testCount()
	{
		System.out.println("********** Total Record : " + pRepo.count());
	}
}
