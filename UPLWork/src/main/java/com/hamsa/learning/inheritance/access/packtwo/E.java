package com.hamsa.learning.inheritance.access.packtwo;
import com.hamsa.learning.inheritance.access.packone.A;

public class E {
	A a = new A();

	public void display() {

	System.out.println("Within PACKAE ONE WITHIN CLASS E NO INHERITANCE");
	//System.out.println("Default Modifier::"+a.def_a);
	//System.out.println("Private Modifier::"+ a.priv_a);
	//System.out.println("Protected Modifier::"+a.pro_a);
	System.out.println("Public Modifer::"+a.pub_a);
	}

}
