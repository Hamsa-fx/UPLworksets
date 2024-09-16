package com.hamsa.assignment2;

public class UsesOfStringBufferAndStringBuilder {
	public static void main(String[] args) {
		String string = new String ("Stanford");
		string += "Lost!!";
		

System.out.println ("Value stored in string = " + string);

StringBuffer stringBuffer = new StringBuffer ("Stanford");

stringBuffer.append ("Lost!!");

System.out.println ("Value stored in stringbuffer = " + stringBuffer);
	}

}
