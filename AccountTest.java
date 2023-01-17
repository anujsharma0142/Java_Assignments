package com.monocept.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(202120040,"Anuj Sharma",2000);
		account.deposit(500);
		account.withdraw(600);
		printData(account);
		
	}
	
	public static void printData(Account account) {
		System.out.println("Account No. is : " +account.getAccountNumber()+ 
				"\n Acoount Name :   " +account.getName() +
				"\n Account Balance is : " 
				+ account.getBalance());
		
	}

}
