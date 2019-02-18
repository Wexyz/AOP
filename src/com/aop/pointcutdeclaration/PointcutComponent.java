package com.aop.pointcutdeclaration;

import org.springframework.stereotype.Component;

@Component
public class PointcutComponent {
	
	public void PCComponentMethod() {
		System.out.println("Running Component");
	}
}
