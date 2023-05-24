package com.satheesh.customer.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Data
@Entity
public class Person implements Serializable{
	 @Id
	   @GenericGenerator(name="auto",strategy="increment")
	   @GeneratedValue(generator="auto")
private Integer id;
private String name;
private String email;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="foreign_key")
   private List<BankAccount> accounts;
}
