package com.hamsa.bankapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankServiceImp implements BankingService {
	Person person = new Person();

	public void deposit() throws Exception {
		String input;
		float depositMoney, balance;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter money you want to deposit");
		input = buffer.readLine();
		depositMoney = Integer.parseInt(input);
		balance = person.getBalance();
		balance = balance + depositMoney;
		person.setBalance(balance);
	}

	public void withdraw() throws Exception {
		String input;
		float withdrawMoney, balance;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter money you want to withdraw");
		input = buffer.readLine();
		withdrawMoney = Integer.parseInt(input);
		balance = person.getBalance();
		if (balance >= withdrawMoney) {
			balance = balance - withdrawMoney;
			person.setBalance(balance);
		} else {
			System.out.println("Withdraw amount is greater than balance");
		}
	}

	public void displayBalance() {
		System.out.println("\n\t Your account information ");
		System.out.println("\t Account Number = " + person.getAccountNumber() + "\n\t Name = " + person.getName()
				+ "\n\tBalance = " + person.getBalance());
	}

}
