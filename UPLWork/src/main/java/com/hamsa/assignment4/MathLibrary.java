package com.hamsa.assignment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  class CalculateArea {
	private final static double PIE = 3.14;

	CalculateArea (float radius) {
	System.out.println ("The area of the circle with radius = "+ (PIE * radius * radius));
	}

}

class Truncate {
	Truncate(float number) {
		System.out.println("The result after truncation = " + Math.ceil((number * 10) / 10));

	}
}

class CalculatePower {
	CalculatePower(float number, int power) {
		System.out.println("The result of " + number + " power " + power + " ="

				+ Math.pow(number, power));

	}
}


class TrignometricCalculation {

	TrignometricCalculation(float number) {
		System.out.println("The sin of " + number + " = " + Math.sin(number));
		System.out.println("The cosine of " + number + " = " + Math.cos(number));
		System.out.println("The tangent of " + number + " = "

				+ Math.tan(number));

	}
}


class SquareRoot {
	SquareRoot (float number) {
		System.out.println ("The square root of " + number + " = "

		+ Math.sqrt (number));

		}
		}


class RandomNumberGeneration {
RandomNumberGeneration () {
System.out.println ("The generated random number = " + Math.random ());
}
}


public class MathLibrary {
public static void main (String[] args) throws IOException {
float radius, number;
int power;
BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
System.out.print ("Enter the radius of the circle = ");
String string = buffer.readLine();
radius = Float.parseFloat (string);
CalculateArea calculationArea = new CalculateArea (radius);
System.out.print ("Enter the number to truncate = ");
string = buffer.readLine ();
number = Float.parseFloat (string);Truncate truncate = new Truncate (number);
System.out.print("Enter the number to get power of that = ");
string = buffer.readLine();
number = Float.parseFloat (string);
System.out.print ("Enter the power to " + number + " =");
string = buffer.readLine();
power = Integer.parseInt (string);
CalculatePower calculatePower = new CalculatePower (number, power);
System.out.print ("Enter the number to find it sine, cosine and tangent = ");
string = buffer.readLine ();
number = Float.parseFloat(string);
TrignometricCalculation trignometricCalculation = new TrignometricCalculation (

number);

System.out.print ("Enter the number to find its square root = ");
string = buffer.readLine ();
number = Float.parseFloat (string);
SquareRoot squareRoot = new SquareRoot (number);
RandomNumberGeneration randomNumberGeneration = new RandomNumberGeneration();
}


}
