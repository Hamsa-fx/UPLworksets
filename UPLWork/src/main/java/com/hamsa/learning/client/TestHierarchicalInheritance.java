package com.hamsa.learning.client;

import com.hamsa.learning.oopsinheritance.FTEmployee;
import com.hamsa.learning.oopsinheritance.PTEmployee;

public class TestHierarchicalInheritance {
	public static void main(String[] args) {
		FTEmployee ftEmployee = new FTEmployee("Ganesh", "Krishna", "A002", "MD", 100000.0);
		ftEmployee.display();
		PTEmployee pEmployee = new PTEmployee("Mohan", "Kumar", "A003", "labour", 8000.0);
		pEmployee.display();
	}
}

