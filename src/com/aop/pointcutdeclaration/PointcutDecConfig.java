package com.aop.pointcutdeclaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.aop.pointcutdeclaration")
public class PointcutDecConfig {
	
}
