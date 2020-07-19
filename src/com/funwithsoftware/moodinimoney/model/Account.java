package com.funwithsoftware.moodinimoney.model;

import java.math.BigDecimal;

public class Account {
	
	private String accountName;
	private long id;
	

	private String accountType;
	private BigDecimal currentBalance;
	private BigDecimal transactionsPending;
	private TransactionSet transactions;
	private BigDecimal budgetAmount;
	
	

	public Account() {
		
		this.currentBalance = new BigDecimal(0);
		transactions = new TransactionSet();
		this.budgetAmount = new BigDecimal(0);
	}
	
	public Account(Transaction openingTransaction) {
		this.currentBalance = openingTransaction.getActualAmount();
		transactions = new TransactionSet();
		this.budgetAmount = openingTransaction.getBudgetAmount();
		this.transactionsPending = openingTransaction.getBudgetAmount();
		
	}
	
	public Account(String accountName) {
		this.accountName = accountName;
		this.currentBalance = new BigDecimal(0);
		transactions = new TransactionSet();
		this.budgetAmount = new BigDecimal(0);
		this.transactionsPending = new BigDecimal(0);
	}
	
	
	public void addTransaction(Transaction t) {
		
		this.currentBalance = currentBalance.add(t.getActualAmount());
		this.transactionsPending = transactionsPending.add(t.getPendingAmount());
		this.budgetAmount = budgetAmount.add(t.getBudgetAmount());
	}
	
	public void printBalance() {
		System.out.println("Account: " + this.getAccountName() + 
				" Balance: " + this.currentBalance.doubleValue() + " Pending " + this.transactionsPending.doubleValue());
	}
	
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccount(String accountName) {
		this.accountName = accountName;
	}
	
	public String toString() {
		return this.accountName;
	}


	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public BigDecimal getTransactionsPending() {
		return transactionsPending;
	}

	public void setTransactionsPending(BigDecimal transactionsPending) {
		this.transactionsPending = transactionsPending;
	}

	public TransactionSet getTransactions() {
		return transactions;
	}

	public void setTransactions(TransactionSet transactions) {
		this.transactions = transactions;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBudgetAmount() {
		return budgetAmount;
	}

	public void setBudgetAmount(BigDecimal budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

}
