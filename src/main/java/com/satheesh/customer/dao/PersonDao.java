package com.satheesh.customer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.satheesh.customer.entity.Person;
import com.satheesh.customer.repository.PersonRepository;
@Repository
public class PersonDao {
	@Autowired
   private  PersonRepository repository;
	public Person save(Person person) {
		return repository.save(person);
	}
}
