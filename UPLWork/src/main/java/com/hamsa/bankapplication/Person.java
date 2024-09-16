package com.hamsa.bankapplication;

public class Person {
	private static int accountNumber;
	private static String name;
	private static float depositMoney;
	private static float withdrawMoney;
	//private static float balance;
	private float balance;
	private int choice;

	public int getChoice() {
		return choice;
	}

	/**
	 * @param choice the choice to set
	 */
	public void setChoice(int choice) {
		this.choice = choice;		
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the depositMoney
	 */
	public float getDepositMoney() {
		return depositMoney;
	}

	/**
	 * * @param depositMoney the depositMoney to set
	 */
	public void setDepositMoney(float depositMoney) {
		this.depositMoney = depositMoney;
	}

	/**
	 * @return the withdrawMoney
	 */
	public float getWithdrawMoney() {
		return withdrawMoney;
	}

	/**
	 * @param withdrawMoney the withdrawMoney to set
	 */
	public void setWithdrawMoney(float withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}

	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

}
