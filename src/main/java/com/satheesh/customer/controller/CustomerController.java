package com.satheesh.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.satheesh.customer.dto.CustomerDto;
import com.satheesh.customer.dto.ResponseStructure;
import com.satheesh.customer.entity.Customer;
import com.satheesh.customer.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService cs;
	@PostMapping(value="/saveCustomer")
  public @ResponseBody ResponseStructure<Customer> saveCustomer(@RequestBody CustomerDto customer) {
	  return  cs.saveCustomer(customer);
  }
	@GetMapping(value="/getall")
public @ResponseBody ResponseStructure<List<Customer>> getAllCustomer() {
	 return cs.getAllCtomers();
}
//	@GetMapping("/customer/{id}")
//public Customer getDataById(@PathVariable("id") int id) {
//	return cs.getCustomerDataById(id);
//}
//	@DeleteMapping("/customer")
//	public Customer deleteCustomer(@RequestParam("id") int id) {
//		return cs.deletCustomerById(id);
//	}
//	
//////	public  @ResponseBody List <Customer>getCustomerByName  @Pathvariable("name") String name){
//////		return cs.getCustomerByName(name);
//////	}
////	@PostMapping("/validatecustomer")
////	public List  <Customer> validateCustomers
////	
////	(@RequestParam ("name") String name,  @RequestParam ("email")String email){
////		return  null;
////	}
////	
////}
//	@GetMapping("/customername/{name}")
//	public @ResponseBody List<Customer> getCustomerBYName(@PathVariable("name") String name){
//		return cs.getCustomerByName(name);
//	}
//    @GetMapping("/validate")
//	public List<Customer> validateCustomer(@RequestParam("name") String name,@RequestParam("email") String email) {
//		return cs.validateCustomer(name, email);
//	}
}
