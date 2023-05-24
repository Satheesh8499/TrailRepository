package com.satheesh.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Data
@Entity
public class BankAccount {
	 @Id
	   @GenericGenerator(name="auto",strategy="increment")
	   @GeneratedValue(generator="auto")
   @Column(name="p_id")
  private Integer pId;
  private String name;
  @Column(name="account_number")
  private Long accountNumber;
}
