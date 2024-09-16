package com.hamsa.learning.oopsinheritance;

class Animal {
	public void eat() {
		System.out.println("eating..");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("barking..");
	}
}

public class TestAnimal {
	
	public static void main(String args[]) {
		Dog dog = new Dog();
		
	//	Animal dog2 = new Dog();
		dog.eat();
		dog.bark();
		
		Animal dog2 = new Dog();
		dog2.eat();
	//	dog2.bark();   type animal --no child method

	}
}
