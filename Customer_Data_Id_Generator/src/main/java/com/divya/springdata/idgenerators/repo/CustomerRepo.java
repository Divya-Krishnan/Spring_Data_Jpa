package com.divya.springdata.idgenerators.repo;

import org.springframework.data.repository.CrudRepository;

import com.divya.springdata.idgenerators.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
