package com.ani.rest.repository;

import java.util.Collection;

import com.ani.rest.domain.BankAccount;

public interface BankAccountRepository {
    
    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();

    void update(BankAccount update);
    
    void delete(Long id);
}


