package com.hamsa.assignment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

class CopyFile {
	public CopyFile() {
		File sourceFile = null;
		File destinationFile = null;
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the file path name you want to copy: ");
			String fileName = buffer.readLine();
			sourceFile = new File(fileName);
// checking for the existence of source file
			if (sourceFile.exists()) {
				System.out.print("Enter the file path where you want to copy: ");
				fileName = buffer.readLine();
				destinationFile = new File(fileName);
				destination(sourceFile, destinationFile);
// if destination file does not exists than create new file
				if (!destinationFile.exists()) {
					System.out.println("The destination file does not exists");
					System.out.println("New file is created for copying");
					destinationFile.createNewFile();
					destination(sourceFile, destinationFile);
				}
			} else {
				System.out.println("File source file does not exists exists");
				System.exit(0);
			}
			InputStream inputStream = new FileInputStream(sourceFile);
			OutputStream outputStream = new FileOutputStream(destinationFile);
			byte[] buf = new byte[1024];
			int len;
			while ((len = inputStream.read(buf)) > 0) {
				outputStream.write(buf, 0, len);
			}
			inputStream.close();
			outputStream.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println(fileNotFoundException.getMessage() + " in the specified directory.");
			System.exit(0);
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
	}

// This method will copy file to destination
	void destination(File sourceFile, File destinationFile) {
		try {
			InputStream input = new FileInputStream(sourceFile);
			OutputStream output = new FileOutputStream(destinationFile);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = input.read(buffer)) > 0) {
				output.write(buffer, 0, len);
			}
			input.close();
			output.close();
			System.out.println("File copied");
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println(fileNotFoundException.getMessage() + " in the specified directory.");
			System.exit(0);
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
	}
}

public class StartCopy {
	public static void main(String[] args) {
		new CopyFile();
	}
	
}
