package com.aop.before;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.before.dao.AccountDAO;
import com.aop.before.dao.MembershipDAO;

//Spring AOP uses some AspectJ

public class MainBefore {
	public static void main(String[] args) {
		System.out.println("Initiating main");
		
		// read spring config
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeforeConfig.class);
		
		// get bean from container
		AccountDAO Adao = context.getBean("accountDAO",AccountDAO.class);
		MembershipDAO MDao = context.getBean("membershipDAO",MembershipDAO.class);
		
		// Account pojo
		Account acc = new Account();
		
		// call method
		Adao.addAccount(acc, true);
		System.out.println("!!ENDING ACCOUNTDAO\n");
		
		MDao.addAccount();
		System.out.println("!!ENDING MEMBERSHIPDAO");
		
		// close the context
		context.close();
	}
}
