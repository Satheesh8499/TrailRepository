package com.satheesh.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satheesh.customer.dao.PersonDao;
import com.satheesh.customer.entity.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDao dao;
   public Person savePerson(Person person) {
	   return dao.save(person);
   }
}
