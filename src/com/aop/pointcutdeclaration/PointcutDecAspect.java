package com.aop.pointcutdeclaration;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutDecAspect {
	
	@Pointcut("execution(* com.aop.pointcutdeclaration.*.*(..))")
	private void pointcutMethod() {
		// no body
		System.out.println("This should not print!!");
	}
	
	@Before("pointcutMethod()")
	public void beforeMethod() {
		System.out.println("Running BEFORE POINTCUT");
	}
	
	// REUSING
	@Before("pointcutMethod()")
	public void reusingMethod() {
		System.out.println("Running REUSE METHOD");
	}
}
