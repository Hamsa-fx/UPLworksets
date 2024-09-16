package com.hamsa.assignment7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseFileContent {
	public static void writeToFile(String line) {
		BufferedWriter bufferedWriter = null;
		try {
			// Construct the BufferedWriter object
			bufferedWriter = new BufferedWriter(new FileWriter("E:\\outfile.txt"));
			// Start writing to the output stream
			bufferedWriter.append(line);
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
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

	public static void main(String[] args) {
		try {
			File file = new File("E:\\FriendList.txt");
			FileReader fileReader = new FileReader(file);
			char[] character = new char[(int) file.length()];
			char[] newCharacter = new char[(int) file.length()];
			StringBuffer stringBuffer = new StringBuffer();
			fileReader.read(character, 0, (int) file.length());
			int length = (int) file.length();
			for (int count = 0, index = length - 1; count < length; count++, index--) {
				newCharacter[count] = character[index];
				stringBuffer.append(newCharacter[count]);
			}
			writeToFile(stringBuffer.toString());
			fileReader.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
