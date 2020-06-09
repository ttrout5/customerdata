package com.udemy.springboot.customerdata.repository;

import org.springframework.data.repository.CrudRepository;

import com.udemy.springboot.customerdata.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
