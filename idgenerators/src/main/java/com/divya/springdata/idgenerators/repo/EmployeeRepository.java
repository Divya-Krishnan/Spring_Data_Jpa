package com.divya.springdata.idgenerators.repo;

import org.hibernate.annotations.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.divya.springdata.idgenerators.entity.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
