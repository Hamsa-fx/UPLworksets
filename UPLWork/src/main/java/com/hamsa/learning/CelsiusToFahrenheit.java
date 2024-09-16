package com.hamsa.learning;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius");
		float degree = scanner.nextFloat();
		System.out.println("The Faherenheit value is:");
		float fhnt = (degree*9/5)+32;
		System.out.println(degree+" Celsius ="+fhnt+" Fahrenheit");
		scanner.close();
		}

}
