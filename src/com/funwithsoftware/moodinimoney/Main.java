package com.funwithsoftware.moodinimoney;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.funwithsoftware.moodinimoney.model.Transaction;
import com.funwithsoftware.moodinimoney.model.TransactionSet;
import com.funwithsoftware.moodinimoney.model.Account;

public class Main {
	
	
	public static void main(String[] args) {
		
		Account v1 = new Account("Checking");
		Account v2 = new Account("Credit Card");
		
		v1.printBalance();
		v2.printBalance();
		Transaction t1 = new Transaction("MyWork", new BigDecimal(1000), LocalDate.now(), 
			new BigDecimal(1000), new BigDecimal(0), "Pay Day!", "OneTime");
		
		v1.addTransaction(t1);
		v1.printBalance();
		
		Transaction t2 = new Transaction("Mortgage", new BigDecimal(-100), LocalDate.now(), 
				new BigDecimal(-100), new BigDecimal(0), "Mortgage", "OneTime");
		
		v1.addTransaction(t2);
		v1.printBalance();
		

	}

}
