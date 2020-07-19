package com.funwithsoftware.moodinimoney.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
	
	private long id;
	private BigDecimal budgetAmount;
	private LocalDate transactionDate;
	private BigDecimal actualAmount;
	private BigDecimal pendingAmount;

	private String transactionNotes;
	private String frequency;
	private String category;
	private String transactionName;
	private String source;
	
	/**
	 * Default constructor.  Sets date to today.
	 */
	public Transaction() {
		
		this.transactionDate = LocalDate.now();
		this.budgetAmount = new BigDecimal(0);
		
		this.actualAmount =  new BigDecimal(0);
		this.pendingAmount = new BigDecimal(0);
		
		
		
	}
	

	public Transaction(String source, BigDecimal budgetAmount, LocalDate transactionDate, 
			BigDecimal actualAmount, BigDecimal pendingAmount, String transactionNotes)
	{
		this.source = source;
		this.budgetAmount = budgetAmount;
		this.transactionDate = transactionDate;
		this.actualAmount = actualAmount;
		this.pendingAmount = pendingAmount;
	
		this.transactionNotes = transactionNotes;
		this.frequency = "OneTime";
		
	}
	
	public Transaction(String source, BigDecimal budgetAmount, LocalDate transactionDate, 
			BigDecimal actualAmount, BigDecimal pendingAmount, String transactionNotes, String frequency)
	{
		
		this.source = source;
		this.budgetAmount = budgetAmount;
		this.transactionDate = transactionDate;
		this.actualAmount = actualAmount;
		this.pendingAmount = pendingAmount;
		
		this.transactionNotes = transactionNotes;
		this.frequency = frequency;
		
		
	}
	
	
	
	
	
	public void setAmount(BigDecimal budgetAmount) {
		
		this.budgetAmount = budgetAmount;
	}
	
	public BigDecimal getBudgetAmount() {
		return budgetAmount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getActualAmount() {
		return actualAmount;
	}

	public void setActualAmount(BigDecimal actualAmount) {
		this.actualAmount = actualAmount;
	}

	public BigDecimal getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(BigDecimal pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	public void setBudgetAmount(BigDecimal budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public String getTransactionNotes() {
		return transactionNotes;
	}

	public void setTransactionNotes(String transactionNotes) {
		this.transactionNotes = transactionNotes;
	}



	public String getFrequency() {
		return frequency;
	}



	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getTransactionName() {
		return transactionName;
	}



	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}

}
