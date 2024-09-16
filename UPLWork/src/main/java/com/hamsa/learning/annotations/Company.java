package com.hamsa.learning.annotations;

@FunctionalInterface
interface MyDemo {
	public String display();
}

class MyDemoImpl implements MyDemo {
	@Override
	public String display() {
		return "SNIPE TECH PVT LTD";
	}
}

public class Company {
	public static void main(String args[]) {
		MyDemo demo = new MyDemoImpl();
		System.out.println(demo.display());
	}

}
