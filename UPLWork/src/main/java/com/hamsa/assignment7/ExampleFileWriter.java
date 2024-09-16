package com.hamsa.assignment7;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter {
	public void writeToFile(String filename) {
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(filename));
			bufferedWriter.write("Writing line one to file");
			bufferedWriter.newLine();
			bufferedWriter.write("ganesh");
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.flush();
					bufferedWriter.close();
				}
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ExampleFileWriter().writeToFile("E:\\outputfile.txt");
	}

}
