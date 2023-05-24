package com.satheesh.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.satheesh.customer.entity.Customer;
import com.satheesh.customer.repository.CustomerRepository;

@Component
public class CustomerDao {
	@Autowired
    private CustomerRepository sr;
		public Customer saveCustomer(Customer customer) {
			return sr.save(customer);
		}
		public List<Customer> getAllCustomerData() {
			return sr.findAll();
		}
		public Customer getCustomerDataById(int id) {
//			return sr.findById(id).orElse(new Customer(0, null, null));
			return sr.findById(id).orElse(new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
		}
		public Customer deletCustomerById(int id) {
			Customer customer=getCustomerDataById(id);
			if(customer.getId()!=404) {
		       sr.deleteById(id);
			}
			return customer;
		}
		public List<Customer> getCustomerByName(String name) {
			 return sr.findByName(name);
		}
		
		
	public  List<Customer> validateCustomer (String name ,String email) {
			return sr.validateCustomer(name,email);
		}
}
