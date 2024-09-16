package com.hamsa.assignment7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleFileReader {
	public void readFromFile(String filename) {
		BufferedReader bufferedReader = null;
		try {
			// Construct the BufferedReader object
			bufferedReader = new BufferedReader(new FileReader(filename));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				// Process the data, here we just print it out
				System.out.println(line);
			}
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			// Close the BufferedReader
			try {
				if (bufferedReader != null)
					bufferedReader.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ExampleFileReader().readFromFile("E:\\FriendList.txt");
	}

}
