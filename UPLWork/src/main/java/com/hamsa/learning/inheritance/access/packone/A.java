package com.hamsa.learning.inheritance.access.packone;

public class A {
	int def_a=1;
	private int priv_a=2;
	protected int pro_a=3;
	public int pub_a=4;
	public A() {}
	public void display() {
	System.out.println("Within PACKAE ONE WITHIN CLASS A ");
	System.out.println("Default Modifer::"+this.def_a);
	System.out.println("Private Modifier::"+ this.priv_a);
	System.out.println("Protected Modifier::"+this.pro_a);
	System.out.println("Public Modifer::"+this.pub_a);
	}

}
