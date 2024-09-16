package com.hamsa.learning.client;
import com.hamsa.learning.oopsinterface.Addition;
import com.hamsa.learning.oopsinterface.Subtraction;
import com.hamsa.learning.oopsinterface.BasicCal;

public class TestPoly {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCal basicCal = new Addition();
		System.out.println("Addition :: "+ basicCal.compute(10, 20));
		basicCal = new Subtraction();
		System.out.println("Subtraction :: "+ basicCal.compute(30, 20));
		}

}
