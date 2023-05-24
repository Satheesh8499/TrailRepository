package com.satheesh.customer.dto;

import java.io.Serializable;

import com.satheesh.customer.entity.Customer;

import lombok.Data;
@Data 
public class CustomerDto implements Serializable {
   private Integer id;
   private String name;
   private String email;
   public CustomerDto(Customer customer) {
	   
   }
   public CustomerDto(){
	   
   }
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
     
}
