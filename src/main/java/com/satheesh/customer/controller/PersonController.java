package com.satheesh.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satheesh.customer.entity.Person;
import com.satheesh.customer.service.PersonService;

@RestController
public class PersonController {
	@Autowired
    private PersonService service;
	@PostMapping("/person")
    public Person savePerson(@RequestBody Person person) {
    	return service.savePerson(person);
    }
    
}
