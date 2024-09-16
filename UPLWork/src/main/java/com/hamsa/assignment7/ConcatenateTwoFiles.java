package com.hamsa.assignment7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;

class Concatenate {
	public Concatenate(String firstFileName, String secondFileName, String resultantFileName) throws IOException {
		FileInputStream file1 = null;
		FileInputStream file2 = null;
		SequenceInputStream file3 = null;
		file1 = new FileInputStream(firstFileName);
		file2 = new FileInputStream(secondFileName);
		file3 = new SequenceInputStream(file1, file2);
		BufferedInputStream inputBuffer = new BufferedInputStream(file3);
		int check;
		StringBuffer content = new StringBuffer();
		while ((check = inputBuffer.read()) != -1) {
			content.append((char) check);
		}
		writeToFile(content.toString(), resultantFileName);
		System.out.println("File is concatenated");
		inputBuffer.close();
		file1.close();
		file2.close();
	}

	public void writeToFile(String line, String resultantFileName) {
		BufferedWriter bufferedWriter = null;
		try {
// Construct the BufferedWriter object
			bufferedWriter = new BufferedWriter(new FileWriter(resultantFileName));
// Start writing to the output stream
			bufferedWriter.append(line);
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
// Close the BufferedWriter
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
}

public class ConcatenateTwoFiles {
	public static void main(String[] args) {
		String firstFileName, secondFileName, resultantFileName;
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the first file name ");
			firstFileName = buffer.readLine();
			System.out.print("Enter the second file name ");
			secondFileName = buffer.readLine();
			System.out.print("Enter the resultant file name where you want to concatenate");
			resultantFileName = buffer.readLine();
			Concatenate concatenate = new Concatenate(firstFileName, secondFileName, resultantFileName);

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
