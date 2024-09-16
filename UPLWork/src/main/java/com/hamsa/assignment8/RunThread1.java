package com.hamsa.assignment8;

import java.io.IOException;


class FibonacciThread extends Thread {
       public void run () {
         try {
           new FibonacciInput ();
             } catch (IOException exception) {
               exception.printStackTrace ();
             }
          System.out.println ("\n Fibonacci Thread Interrupted");
       }
}


class PrimeNumberThread extends Thread {
	public void run () {
		new GeneratePrimeNumberInputs ();
		System.out.println ("\n Prime Number Thread Interrupted");
		}
	}


class CelsiusToFahrenheitThread extends Thread {
     public void run() {
        new CelsiusToFahrenheitInput ();
          System.out.println ("\n Celsius to Fahrenheit Thread Interrupted");
          }
  }

public class RunThread1 {
	public static void main (String [] args) {
		FibonacciThread fibonacciThread = new FibonacciThread();
		PrimeNumberThread primeNumberThread = new PrimeNumberThread();
		CelsiusToFahrenheitThread celsiusToFahrenheitThread = new CelsiusToFahrenheitThread();
		fibonacciThread.setPriority (Thread.MAX_PRIORITY);
		primeNumberThread.setPriority (Thread.MIN_PRIORITY);
		celsiusToFahrenheitThread.setPriority (fibonacciThread.getPriority() - 1);
		System.out.println ("\n Start Fibonacci Thread");
		fibonacciThread.start ();
		try {
			fibonacciThread.join ();
		} catch (InterruptedException interruptedException) {
		interruptedException.printStackTrace ();
		}
		System.out.println ("\n Start Celsius To Fahrenheit Thread");
		celsiusToFahrenheitThread.start ();
		try {
		celsiusToFahrenheitThread.join ();
		} catch (InterruptedException interruptedException) {
		interruptedException.printStackTrace();
		}
		System.out.println ("\n Start Prime Thread");
		primeNumberThread.start ();
		}
		}



