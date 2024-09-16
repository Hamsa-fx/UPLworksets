package com.hamsa.learning.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestPredefinedFun {
	public static void main(String[] args) {
		// check the given number is positive or negative
		Predicate<Integer> pred = num -> num > 0;
		System.out.println(pred.test(1111));
		System.out.println(pred.test(0));
		System.out.println(pred.test(-1111));
		// check square of a number
		Consumer<Integer> square = num -> System.out.println(num * num);
		square.accept(1111);
		// check the given string size
		Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		c.accept("MALLIKARJUNA");
		c.accept("MYSURU");
		// find the string length
		Consumer<String> strLen = (str) -> System.out.println("STRING LENGTH IS" + str.length());

		strLen.accept("MALLIKARJUNA");
		strLen.accept("MYSURU");
		// FUNCTION
		Function<Integer, String> getInt = t -> t * 10 + " data multiplied by 10";

		System.out.println(getInt.apply(10));
		Function<String, String> strLength = msg -> "Mr. Gandhi message is :"+msg;

		System.out.println(strLength.apply("Follow Non-Violance"));
		//SUPPLIER
		Supplier<Double> rand = ()->Math.random();
		System.out.println(rand.get());
		Supplier<String> obj = ()->"I am learning Predefined function ";
		System.out.println(obj.get());
		}

}
