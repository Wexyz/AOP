package com.aop.before.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println("Running MembershipDAO: "+getClass());
	}
}
