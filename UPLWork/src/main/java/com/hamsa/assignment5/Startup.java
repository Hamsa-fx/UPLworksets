package com.hamsa.assignment5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SecondClass {
	private String name;
	private String address;
	private int age;
	private static String cityName;

	SecondClass() {
		name = "Lakshmi";
		address = "Vijaynagar";
		age = 23;
		display();
	}

	SecondClass(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		display();
		
	}

	public void initialize(String city) {
		cityName = city;
	}

	public void show() {
		System.out.println("City Name = " + cityName);
	}

	public void display() {
		System.out.println("\t Name = " + name + "\n\t Age = " + age

				+ "\n\t Address = " + address);

	}
}

public class Startup {
	public static void main(String[] args) throws IOException {
		String name, address, cityName;
		int age;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name :");
		name = buffer.readLine();
		System.out.print("Enter the age :");
		age = Integer.parseInt(buffer.readLine());
		System.out.print("Enter the address :");
		address = buffer.readLine();
		System.out.print("Enter the city name :");
		cityName = buffer.readLine();
		SecondClass firstInstance = new SecondClass();
		SecondClass secondInstance = new SecondClass(name, address, age);
		firstInstance.initialize(cityName);
		secondInstance.show();
	}

}
