package com.ezra.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.ezra.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount) {
		System.out.println(getClass()+":doing my db back");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+"doWork()");
		return true;
	}
	
}
