package com.hamsa.assignment7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleOutputStream {
	public void writeToFile(String filename) {
		BufferedOutputStream bufferedOutput = null;
		try {
			bufferedOutput = new BufferedOutputStream(new FileOutputStream(filename));
			bufferedOutput.write("Hamsa".getBytes());
			bufferedOutput.write("\n".getBytes());
			bufferedOutput.write("Line two".getBytes());
			bufferedOutput.write("\n".getBytes());
			bufferedOutput.write(65);
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (bufferedOutput != null) {
					bufferedOutput.flush();
					bufferedOutput.close();
				}
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ExampleOutputStream().writeToFile("E:\\FriendList.txt ");
	}
}
