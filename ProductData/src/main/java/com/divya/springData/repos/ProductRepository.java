package com.divya.springData.repos;

import org.springframework.data.repository.CrudRepository;

import com.divya.springData.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
