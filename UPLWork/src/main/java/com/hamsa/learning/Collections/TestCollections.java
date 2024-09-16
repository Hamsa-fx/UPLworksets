package com.hamsa.learning.Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Country implements Comparable<Country> {
	private String name;

	public Country(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Country o) {
		if (this.name.equals(o.name))
			return 0;
		else if (this.name.compareTo(o.name) > 0)
			return -1;
		else
			return 1;

	}
}

public class TestCollections {
	public static void main(String args[]) {
		List<Country> countries = new LinkedList<Country>();
		countries.add(new Country("India"));
		countries.add(new Country("Srilanka"));
		countries.add(new Country("America"));
		countries.add(new Country("Australia"));
		countries.add(new Country("Mongolia"));
		countries.add(new Country("Russia"));

		System.out.println("Before sorting");
		display(countries);

		Collections.sort(countries);
		System.out.println("After sorting");
		display(countries);

		System.out.println("After reversing");
		Collections.reverse(countries);
		display(countries);

	}

	public static void display(List<Country> countries) {
		System.out.println("---------------------------");
		for (Country country : countries) {
			System.out.println(country);
		}
		System.out.println("---------------------------");
	}
}
