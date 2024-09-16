package com.hamsa.assignment7;

import java.io.*;

public class ExampleInputStream {
	public void readFromFile(String filename) {
		BufferedInputStream bufferedInput = null;
		byte[] buffer = new byte[1024];
		try {
			bufferedInput = new BufferedInputStream(new FileInputStream(filename));
			int bytesRead = 0;
			while ((bytesRead = bufferedInput.read(buffer)) != -1) {
				String chunk = new String(buffer, 0, bytesRead);
				System.out.print(chunk);
			}
			System.out.println("\n Contents of the file is displayed");
		} catch (FileNotFoundException fileNotFound) {
			fileNotFound.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (bufferedInput != null)
					bufferedInput.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ExampleInputStream().readFromFile("E:\\FriendList.txt");
	}

}
