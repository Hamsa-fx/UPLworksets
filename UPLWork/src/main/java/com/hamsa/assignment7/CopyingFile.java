package com.hamsa.assignment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import javax.swing.JOptionPane;

public class CopyingFile {
	public static void main (String [] args) throws IOException {
		int index = 0;
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("Enter the file name that has to be moved: ");
		String src = buffer.readLine ();
		if (src.equals ("")) {
			System.out.println ("Invalid file name");
			System.exit (0);
			}
			File source = new File (src);
			if (!source.exists()) {
			System.out.println ("File does not exist");
			System.exit (0);
			}
			System.out.print ("Enter the complete path where file has to be moved: ");
			String dest = buffer.readLine ();
			if (dest.equals ("" )) {
			System.out.println ("Invalid file name");
			System.exit (0);
			}
			File destination = new File (dest);
			if (! destination.exists ()) {
			System.out.print ("Mentioned file name does not exist \n Do you want to create a new file (Y/N)? ");
			String check = buffer.readLine ();
			if (check.equals ("Y") || check.equals ("y")) {
			destination.mkdir ();
			copyDirectory (source, destination);
			index = 1;
			} else if (check.equals ("N") || check.equals ( "n" ) ) {
			System.exit (0);
			} else {
			System.out.println ("Invalid Entry!");
			System.exit (0);
			}
			} else {
				int num = JOptionPane.showConfirmDialog (null,

				"Given file or folder name already exists \n Do you want to replace now?");

				if (num == 0) {
				copyDirectory (source, destination);
				index = 1;
				}
				}
				if (index == 1) {
				System.out.println ("File moved successfully");
				} else if (index == 0) {
				System.exit (0);
				}
				}

	public static void copyDirectory(File sourceDir, File destDir)

			throws IOException {
		if (!destDir.exists()) {
			destDir.mkdir();
		}
		File[] children = sourceDir.listFiles();
		for (File sourceChild : children) {
			String name = sourceChild.getName();
			File destinationChild = new File(destDir, name);
			if (sourceChild.isDirectory()) {
				copyDirectory(sourceChild, destinationChild);
			} else {
				copyFile(sourceChild, destinationChild);
			}
		}
	}

	public static void copyFile(File source, File destination)

			throws IOException {
		if (!destination.exists()) {
			destination.createNewFile();
		}
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(source);
			outputStream = new FileOutputStream(destination);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, length);
			}
		} finally {
			inputStream.close();
			outputStream.close();
		}
	}
}


