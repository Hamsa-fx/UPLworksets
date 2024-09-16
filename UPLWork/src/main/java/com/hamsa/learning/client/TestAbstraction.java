package com.hamsa.learning.client;
import com.hamsa.learning.oopsinheritance.Employee;
import com.hamsa.learning.oopsinheritance.Person;

public class TestAbstraction {
	public static void main(String args[]) {
		Person person = new Employee("Ganesh","Krishna","B005","Developer",45000.0);
		person.display();
		}

}
