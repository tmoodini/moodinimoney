package com.funwithsoftware.moodinimoney.model;


import java.math.BigDecimal;
import java.util.Vector;

public class TransactionSet {
	
	private Vector<Transaction> transactionSet;
	
	public TransactionSet() {
		setTransactionSet(new Vector<Transaction>());
	}
	
	public TransactionSet(Vector<Transaction> transactionSet) {
		this.transactionSet = transactionSet;
	}

	
	public TransactionSet getMonthFilteredSet(int year, int month) {
		
		Vector<Transaction> filteredVector = new Vector<Transaction>();
		for(int i = 0; i < transactionSet.size();i++) {
			if(transactionSet.get(i).getTransactionDate().getYear() == year && 
					transactionSet.get(i).getTransactionDate().getMonth().getValue() == month) {
					filteredVector.add(transactionSet.get(i));
				
			}
			
		}
		
		return new TransactionSet(filteredVector);
		
	}
	
	public Transaction getTransactionByID(long id) {
		Transaction result = new Transaction();
		for(Transaction t: this.transactionSet) {
			if(t.getId() == id) {
				result = t;
			}
		}
		
		return result;
	}
	
	public int getTransactionIndex(long id) {
		int index = -1;
		for(int i = 0; i < transactionSet.size();i++) {
			if(transactionSet.get(i).getId() == id) {
				index = i;
			}
		}
		
		return index;
	}
	
	public void updateTransaction(long id, Transaction update) {
		
		int index = this.getTransactionIndex(id);
		if(index != 0) {
		transactionSet.removeElementAt(index);
		}
		transactionSet.add(update);
	}
	
	public Vector<Transaction> getTransactionSet() {
		return transactionSet;
	}

	public void setTransactionSet(Vector<Transaction> transactionSet) {
		this.transactionSet = transactionSet;
	}
	
	public void addTransaction(Transaction t) {
		this.transactionSet.add(t);
	}
	
	
	public void printSet() {
		for(Transaction t : transactionSet) {
			System.out.println("Source: " + t.getSource() + 
					" Amount: " + t.getActualAmount() + " Date: " + t.getTransactionDate().getMonth());
		}
	}

}
