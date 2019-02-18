package com.aop.pointcutdeclaration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainPointcut {
 public static void main(String[] args) {
	 System.out.println("Running Main");
	 
	 AnnotationConfigApplicationContext context =
			 new AnnotationConfigApplicationContext(PointcutDecConfig.class);
	 
	 System.out.println("Context config complete \n");
	 
	 PointcutComponent pojo = context.getBean("pointcutComponent",PointcutComponent.class);
	 
	 pojo.PCComponentMethod();
	 
	 context.close();
	 
 }
}
