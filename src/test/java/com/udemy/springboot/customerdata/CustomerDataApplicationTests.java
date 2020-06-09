package com.udemy.springboot.customerdata;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.springboot.customerdata.entity.Customer;
import com.udemy.springboot.customerdata.repository.CustomerRepository;

@SpringBootTest
class CustomerDataApplicationTests {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void shouldAddCustomer() {

		Customer customer = new Customer();
		customer.setName("Tim");
		customer.setEmail("tim@email.com");

		customerRepository.save(customer);

	}

	@Test
	public void shouldAddAnotherCustomer() {
		
		Customer customer = new Customer();
		customer.setName("Kim");
		customer.setEmail("kim@hotmail.com");
		
		customerRepository.save(customer);
	}
	
	@Test
	public void shouldFindCustomerById() {
		
		Optional<Customer> customerOptional = customerRepository.findById(1L);
		
		if(customerOptional.isPresent()) {
			Customer customer = customerOptional.get();
			
			System.out.println(customer);
		} else {
			System.out.println("No customer found for that ID!");
		}
		
	}

}
