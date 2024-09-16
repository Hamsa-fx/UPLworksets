package com.hamsa.bankapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu extends BankServiceImp {
	int choice;
	Person person = new Person();

	void menu() throws Exception {

	String input;
	int choose;

	BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));

	System.out.println ("\n Enter your choice");
	System.out.print ("\n\t Menu");
	System.out.print ("\n\t1:> Deposit\n\t 2:>Withdraw\n\t 3:>Display Account Information\n\t4:>Exit");
	input = buffer.readLine();
	choose = Integer.parseInt (input);
	person.setChoice (choose);
	choice = person.getChoice();
	switch (choice) {
	case 1:
	// Calling to deposit money in the account
	deposit();
	// Calling to once again go to main menu for choosing other options
	menu ();
	case 2:
	// Calling to withdraw money from the account
	withdraw ();
	// Calling to once again go to main menu for choosing other options
	menu ();
	case 3:
	// Calling to display the account information
	displayBalance ();
	// Calling to once again go to main menu for choosing other options
	menu();
	case 4:
	System.exit (0);

	}
	}

}
