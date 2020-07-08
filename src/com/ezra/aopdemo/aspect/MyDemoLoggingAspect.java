package com.ezra.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//this class called Aspect
@Aspect
@Component
public class MyDemoLoggingAspect {
		
		//this is where we add all of our related advices for logging
	
		//lets start with an @Before advice
//		@Before("execution(public void com.ezra.aopdemo.dao.AccountDAO.addAccount())")
//	@Before("execution(public void add*())")
//		@Before("execution(* add*(com.ezra.aopdemo.Account))")	
		@Before("execution(* com.ezra.aopdemo.dao.*.*(..))")
		public void beforeAddAccountAdvice() {
			System.out.println("\n======>Executing @Before adivce on addAccount()");
			
		}
		
}
