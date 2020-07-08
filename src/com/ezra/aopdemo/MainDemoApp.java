package com.ezra.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ezra.aopdemo.dao.AccountDAO;
import com.ezra.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config java class -> DemoConfig
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		//get memebership bean from spring container
				MembershipDAO theMembershipDAO=
						context.getBean("membershipDAO",MembershipDAO.class);
				
		//call the business method
		Account myAccount =new Account();
		theAccountDAO.addAccount(myAccount);
		theAccountDAO.doWork();
		theMembershipDAO.addSilly();
		theMembershipDAO.goToSleep();
		
		//close the context
		context.close();
	}

}
