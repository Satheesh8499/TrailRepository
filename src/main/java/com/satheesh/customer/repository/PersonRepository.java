package com.satheesh.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satheesh.customer.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Integer>{

}
