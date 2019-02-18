package com.aop.before.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	// all advices for logging
	
	// BEFORE advice
	// BEFORE; ALL
//	@Before("execution(public void addAccount())")
//	public void beforeAddAccountAdvice() {
//		System.out.println("calling BEFORE ADVICE");
//	}
	
	// BEFORE; SPECIFIC
	@Before("execution(public void com.aop.before.dao.MembershipDAO.addAccount())")
	public void beforeSpecAdvice() {
		System.out.println("calling SPECIFIC BEFORE ADVICE");
	}
	
	// BEFORE; POINTCUT: "add"
	@Before("execution(public void add*())")
	public void beforeWildAdvice() {
		System.out.println("Calling WILDCARD ADVICE");
	}
	
	// BEFORE; RETURN-TYPE: void
	@Before("execution(void add*())")
	public void beforeReturnType() {
		System.out.println("Calling RETURN-TYPE ADVICE");
	}
	
	// BEFORE; PARAMETER
	// (): no arg; (*): one arg, any type; (..): 0 or more arg, any type
	@Before("execution(* add*(com.aop.before.Account))")
	public void beforeParam1() {
		System.out.println("Calling PARAM: SPEC ARG ADVICE");
	}
	
	@Before("execution(* add*(com.aop.before.Account, ..))")
	public void beforeParam2() {
		System.out.println("Calling PARAM: 2 ARGS ADVICE");
	}
	
	// Any param
	@Before("execution(* add*(..))")
	public void beforeParam3() {
		System.out.println("Calling PARAM: ANY ADVICE");
	}
	
	// package
	@Before("execution(* com.aop.before.dao.*.*(..))")
	public void beforeParam4() {
		System.out.println("Calling PARAM: ALL IN PACKAGE");
	}
}
