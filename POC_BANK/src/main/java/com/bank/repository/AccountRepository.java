package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.Account;

/**
 * @author saluri
 *
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

}
