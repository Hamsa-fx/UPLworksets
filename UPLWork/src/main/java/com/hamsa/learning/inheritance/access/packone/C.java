package com.hamsa.learning.inheritance.access.packone;

public class C {
	A a = new A();
	public void display() {
		System.out.println("Within PACKAE ONE CLASS C INDEPENDENT OF CLASS 	A ");
		System.out.println("Default Modifer::"+a.def_a);
		// System.out.println("Private Modifier::"+ a.priv_a);
		System.out.println("Protected Modifier::"+a.pro_a);
		System.out.println("Public Modifer::"+a.pub_a);
	}
}
