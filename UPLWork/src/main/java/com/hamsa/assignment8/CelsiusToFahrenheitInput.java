package com.hamsa.assignment8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CelsiusToFahrenheitInput {
	public CelsiusToFahrenheitInput() {

		float celsius;
		String string;
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(

					System.in));

			System.out.print("Enter the temperature in celsius = ");
			string = buffer.readLine();
			celsius = Float.parseFloat(string);
			CelsiusToFahrenheit temperature = new CelsiusToFahrenheit(celsius);
			temperature.display();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}

class CelsiusToFahrenheit {
	float celsius, fahrenheit;

	CelsiusToFahrenheit(float celsius) {
		this.celsius = celsius;
	}

	void display() {
		fahrenheit = ((9 * (celsius) / 5) + 32);
		System.out.println("*******************************************************");
		System.out.println(celsius + " Celsius= " + fahrenheit + " Fahrenheit");
		System.out.println("*******************************************************");
	}
}