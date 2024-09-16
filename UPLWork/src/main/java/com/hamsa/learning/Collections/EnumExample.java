package com.hamsa.learning.Collections;

public class EnumExample {
	enum Season {
		WINTER(5), SPRING(10), SUMMER(15), FALL(20);

		int value;

		private Season(int val) {
			this.value = val;
		}
	}

	public static void main(String args[]) {
		for (Season seasion : Season.values()) {
			System.out.println(seasion.name() + " :: " + seasion.value);
		}
		System.out.println(Season.WINTER.value);
	}

}
