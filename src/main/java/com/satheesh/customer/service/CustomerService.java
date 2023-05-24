package com.satheesh.customer.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.satheesh.customer.dao.CustomerDao;
import com.satheesh.customer.dto.CustomerDto;
import com.satheesh.customer.dto.ResponseStructure;
import com.satheesh.customer.entity.Customer;
import com.satheesh.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	  private CustomerDao dao;
	public ResponseStructure<Customer> saveCustomer(CustomerDto dto) {
		Customer customer=new Customer(dto);
		Customer cust = dao.saveCustomer(customer);
		ResponseStructure<Customer> rs = new ResponseStructure<Customer>();
		rs.setData(cust);
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("customer data saved successfully");
		rs.setTimeStamp(LocalDateTime.now());
		return rs;
	}
	public ResponseStructure<Customer> updateCustomer(Customer c) {
		Customer cust=dao.saveCustomer(c);
		ResponseStructure<Customer> rs = new ResponseStructure<Customer>();
		rs.setData(cust);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}
	public ResponseStructure<List<Customer>> getAllCtomers() {
		List<Customer> list = dao.getAllCustomerData();
		ResponseStructure<List<Customer>> rs = new ResponseStructure<>();
		if(list.size()!=0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("customers entry found in database");
		}
		else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("no customers entry found in database");
		}
		return rs;
	}
	public List<Customer> validateCustomer(String name,String email) {
		return dao.validateCustomer(name, email);
	}
	public Customer findCustomerId(Integer id) {
		return dao.getCustomerDataById(id);
	}
	public List<Customer> getCustomerByName(String name){
		return dao.getCustomerByName(name);
	}
	
}
