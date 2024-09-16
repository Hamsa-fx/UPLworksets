package com.hamsa.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Substring {
	String sentence, substring, result;
	int index, lengthOfSubstring;

	Substring(String sentence, String substring, int index) {
		this.sentence = sentence;
		this.substring = substring;
		this.index = index;
	}

	void search() {
		lengthOfSubstring = substring.length();
		result = sentence.substring(index, (index + lengthOfSubstring));
		System.out.println("Substring " + "'" + result + "'" + "is at position " + (index + 1));

	}
}

public class SearchSubstring {
	public static void main(String[] args) throws IOException {
		String sentence, substring;
		int index;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence");
		sentence = buffer.readLine();
		System.out.println("Enter the substring you want to search");
		substring = buffer.readLine();
		index = sentence.indexOf(substring);
		Substring string = new Substring(sentence, substring, index);
		string.search();
	}
}
