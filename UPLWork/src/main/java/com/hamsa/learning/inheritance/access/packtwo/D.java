package com.hamsa.learning.inheritance.access.packtwo;
import com.hamsa.learning.inheritance.access.packone.A;

public class D extends A{
	public void display() {
		System.out.println("Within PACKAE TWO WITHIN CLASS D EXTENDS A ");
		// System.out.println("Default Modifier::"+this.def_a);
		// System.out.println("Private Modifier::"+ this.priv_a);
		System.out.println("Protected Modifier::"+this.pro_a);
		System.out.println("Public Modifer::"+this.pub_a);
	}

}
