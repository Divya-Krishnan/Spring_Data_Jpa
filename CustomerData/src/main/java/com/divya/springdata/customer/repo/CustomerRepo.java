package com.divya.springdata.customer.repo;

import org.springframework.data.repository.CrudRepository;

import com.divya.springdata.customer.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
