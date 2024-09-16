package com.hamsa.assignment8;

class A extends Thread {
public void run() {
for (int count = 1; count <= 5; count++) {
    if (count == 3)
        // yield(10);
    	try {
			sleep(1000);
//Suspends a thread for a specified amount of time
		} catch (Exception exception) {
		
	}	
// Causes the currently executing thread object to temporarily
// pause and allow other threads to execute
System.out.println ("\t From Thread A :" + count + " = " + count);
        }
    }
}

class B extends Thread {
	public void run() {
		for (int count = 1; count <= 5; count++) {
			System.out.println("\t From Thread B :" + count + " =" + count);
			if (count == 3) {
				try {
					sleep(1000);
//Suspends a thread for a specified amount of time
				} catch (Exception exception) {
				
			}	

		}
		System.out.println("Exit from B");
	}
}
}

class C extends Thread {
	public void run() {
		for (int count = 1; count <= 5; count++) {
			System.out.println("\t From Thread C :" + count + " =" + count);
			if (count == 1) {
				try {
					sleep(1000);
//Suspends a thread for a specified amount of time
				} catch (Exception exception) {

				}
			}
		}
		System.out.println("Exit from C");
	}
}

public class RunThread {
	public static void main(String args[]) {
		A threadA = new A();
		B threadB = new B();
		System.out.println(" Start thread A ");
		threadA.start();
		System.out.println(" Start thread B ");
		threadB.start();
		C threadC = new C();
		System.out.println(" Start thread C ");
		threadC.start();
		System.out.println(" End of main thread ");
	}
}
