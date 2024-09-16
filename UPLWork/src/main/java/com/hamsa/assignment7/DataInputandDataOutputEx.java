package com.hamsa.assignment7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputandDataOutputEx {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		DataOutputStream dataOutputStream =

				new DataOutputStream(new FileOutputStream("E:\\studentinfo.txt"));
		dataOutputStream.writeInt(123);
		dataOutputStream.writeFloat(123.45F);
		dataOutputStream.writeLong(789);
		dataOutputStream.close();
		DataInputStream dataInputStream = new DataInputStream(new FileInputStream("E:\\studentinfo.txt"));
		int int123 = dataInputStream.readInt();
		float float12345 = dataInputStream.readFloat();
		long long789 = dataInputStream.readLong();
		dataInputStream.close();
		System.out.println("int123 = " + int123);
		System.out.println("float12345 = " + float12345);
		System.out.println("long789 = " + long789);
	}

}
