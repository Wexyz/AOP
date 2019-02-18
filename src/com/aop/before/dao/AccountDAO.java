package com.aop.before.dao;

import org.springframework.stereotype.Component;

import com.aop.before.Account;

@Component
public class AccountDAO {
	public void addAccount(Account acc, boolean vip) {
		
		System.out.println("Running accountDAO: "+getClass());
		
		
	}
	
}