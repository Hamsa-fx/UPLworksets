package com.hamsa.learning.Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Country1 {
	private String name;
	private String code;

	public Country1(String code, String name) {
		this.code = code;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getCode() + "::" + this.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

class CodeComparator implements Comparator<Country1> {
	public int compare(Country1 o1, Country1 o2) {
		return o1.getCode().compareTo(o2.getCode());
	}
}

class NameComparator implements Comparator<Country1> {
	public int compare(Country1 o1, Country1 o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

public class TestColComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Country1> countries = new LinkedList<Country1>();
		countries.add(new Country1("zIND", "India"));
		countries.add(new Country1("aSRI", "Srilanka"));
		countries.add(new Country1("cAMC", "America"));
		countries.add(new Country1("bAUS", "Australia"));
		countries.add(new Country1("dMON", "Mongolia"));
		countries.add(new Country1("aRUS", "Russia"));

		System.out.println("Before sorting");
		display(countries);

		System.out.println("sorting by code");
		Collections.sort(countries, new CodeComparator());
		display(countries);

		System.out.println("sorting by name");
		Collections.sort(countries, new NameComparator());
		display(countries);
	}

	
	public static void display(List<Country1> countries) {
		System.out.println("---------------------------");
		for (Country1 country : countries) {
			System.out.println(country);
		}
		System.out.println("---------------------------");
	}

}
