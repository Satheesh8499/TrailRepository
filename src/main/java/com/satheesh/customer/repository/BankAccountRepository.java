package com.satheesh.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satheesh.customer.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{

}
