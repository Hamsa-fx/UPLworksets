package com.hamsa.learning.client;
import com.hamsa.learning.oopsinheritance.Employee;
import com.hamsa.learning.oopsinheritance.FTEmployee;


public class TestMultilevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FTEmployee ftEmployee = new FTEmployee("Hamsa", "Ganesh", "B005", "MD",100000.0);
		Employee employee = new Employee("Hamsa","Ganesh","B005","MD",100000.0);
		ftEmployee.display();
		employee.display();
	}

}
