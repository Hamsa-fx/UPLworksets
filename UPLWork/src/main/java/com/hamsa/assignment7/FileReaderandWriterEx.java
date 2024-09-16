package com.hamsa.assignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderandWriterEx {
	public static void main(String args[]) throws IOException {
		FileReader fr;
		try {
			fr = new FileReader(new File("E:\\stdinfo.txt"));
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter fos = new FileWriter(new File("E:\\stdinfo.txt"));
		String line = "1005,Hamsa,bellary";
		fos.write(line);
		fos.close();
	}

}

