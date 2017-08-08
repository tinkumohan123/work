package com.capgemini.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	
	
@Before("execution(* com.capgemini.dao.impl.*.*(..))")
	    public void beforeAdvice(JoinPoint jp)  
	    {  
		 System.out.println("getName"+jp.getSignature().getName());
		 System.out.println("This is before advice");  
	    }  
	 
@After("execution(* com.capgemini.dao.impl.*.*(..))")  
	    public void afterAdvice(JoinPoint jp)
	    {  
	        System.out.println("This is after advice");  
	    } 
	 
}
