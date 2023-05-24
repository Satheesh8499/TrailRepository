package com.satheesh.customer.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.satheesh.customer.dto.CustomerDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer_info")
public class Customer implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	private String name;
	private String email;
	
   public Customer(CustomerDto dto) {
	   this.id=dto.getId();
	   this.name=dto.getName();
	   this.email=dto.getEmail();
   }
  
}
