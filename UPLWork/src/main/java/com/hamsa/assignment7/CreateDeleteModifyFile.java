package com.hamsa.assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Create {
	public Create() {
		File file = null;
		BufferedReader buffer = null;
		BufferedWriter writer = null;
		try {
			buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the file name you want to create: ");
			String fileName = buffer.readLine();
			file = new File(fileName);
			writer = new BufferedWriter(new FileWriter(fileName));
			file.createNewFile();
			System.out.println("File is created");
			System.out.println("The created file name is " + file.getName());
			writeToFile(fileName);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void writeToFile(String fileName) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = null;
		try {
// Construct the BufferedWriter object
			bufferedWriter = new BufferedWriter(new FileWriter(fileName));
			System.out.println("Enter something in the file");
			String line = buffer.readLine();
//Start writing to the output stream
			bufferedWriter.append(line.toString());
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
//Close the BufferedWriter
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

class Modify {
	public Modify() throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name you want to modify");
		String fileName = buffer.readLine();
		Create.writeToFile(fileName);
		System.out.println("File is modified");
	}
}

/**
 * A helper class for Delete
 *
 * @version 1.0
 * @created 12 August 2021 10:13:45 AM
 */
class Delete {
	Delete(String fileName) {
		File file = new File(fileName);
		boolean success = file.delete();
		if (!success) {
			System.out.println("Deletion failed.");
			System.exit(0);
		} else {
			System.out.println("File deleted.");
		}
	}
}

public class CreateDeleteModifyFile {
	public static void main(String[] args) {
		new Create();
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the file name you want to delete: ");
			String fileName = buffer.readLine();
			new Delete(fileName);
			new Modify();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
