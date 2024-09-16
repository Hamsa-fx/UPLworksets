package com.hamsa.assignment9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

class Disc {
	public String title;
	public String singer;

	Disc(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String toString() {
		return ("'" + title + "' by " + singer);
	}
}

public class HashTableManipulation {
	public static void print(String msg, Hashtable<String,Object> box, boolean all) {
		if (msg != null)
			System.out.print(msg + ": ");
		if (box.isEmpty()) {
			System.out.println("The Title Box is empty");
		} else {
			System.out.println("There are " + box.size() + " discs in the Title Box:");
			for (Enumeration e = (all ? box.elements() : box.keys()); 
			 e.hasMoreElements();
			System.out.println("\t" + e.nextElement()));

		}
	}

	public static void main(String[] args) throws IOException {
		Hashtable<String, Object> titleBox = new Hashtable<String, Object>(13, 0.5f);
		//Disc houndDog;
		titleBox.put("Hamein tumse pyar kitna-(Bollywood)",
				new Disc("Hamein tumse pyar kitna-(Bollywood)","Kishore Kumar"));
		titleBox.put("Main nikla gaddi le ke-(Bollywood)", 
				new Disc("Main nikla gaddi le ke-(Bollywood)", "Udit Narayan"));

		titleBox.put("Main hoon na-(Bollywood)", 
				new Disc("Main hoon na-(Bollywood)", "Sonu Nigam"));
		titleBox.put("Dard jab had se gujarta hai to ga lete hain-(Bollywood)",
		        new Disc("Dard jab had se gujarta hai to ga lete hain- 	(Bollywood)", "Kumar Sanu"));

		print("titleBox after adding 4 titles", titleBox, true);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter title for search: ");
		String strTitle = in.readLine();
		System.out.println(strTitle + " is " + (titleBox.containsKey(strTitle) ? "" : "not ") + " in the Title Box");

		titleBox.clear();
		print("Title Box after clearing it", titleBox, true);
		}

}
