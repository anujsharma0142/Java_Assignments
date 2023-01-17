package com.monocept.model;

public class Account {
	private final int accountNum; //it can not be change
	private String name;
	private double balance;
	
	//constructor for accNum and name and balance
	public Account(int accountNum, String name, double balance) {
		this.accountNum = accountNum;
		this.setName(name);
		this.balance = balance;
	}
	//constructor for account num and name
	public Account(int accountNum, String name) {
		this.accountNum = accountNum;
		this.setName(name);
		this.balance = 500;
	}
	
	//getter and setter for balance , account no, deposit, name
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNum;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
