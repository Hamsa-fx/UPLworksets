package com.hamsa.assignment7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("E:\\stdinfo.txt");
			String line = "1004,raghu,bellary";
			fos.write(line.getBytes());
			fos.close();
			FileInputStream fis = new FileInputStream("E:\\stdinfo.txt");
			int ch;
			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
