package com.hamsa.assignment11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class MyServer {
	ServerSocket serverSocket;
	Socket socket;
	ArrayList arrayList = new ArrayList();
	ArrayList arrayList1 = new ArrayList();
	ArrayList arrayList2 = new ArrayList();
	ArrayList arrayListName = new ArrayList();
	Socket socket1, socket2;

	MyServer() throws IOException {
		serverSocket = new ServerSocket(1004); // create server socket
		while (true) {
			socket = serverSocket.accept(); // accept the client socket
			socket1 = serverSocket.accept();
			socket2 = serverSocket.accept();
			arrayList.add(socket); // add the client socket in array list
			arrayList1.add(socket1);
			arrayList2.add(socket2);
			System.out.println("Client is Connected");
			// new thread for maintaining the list of user name
			MyThread2 myThread2 = new MyThread2(socket2, arrayList2,arrayListName);
			Thread thread = new Thread(myThread2);
			thread.start();
			MyThread myThreadReceiveSending = new MyThread(socket, arrayList);// new

			// thread for receiving and sending the messages

			Thread thread1 = new Thread(myThreadReceiveSending);
			thread1.start();

			MyThread1 myThreadUpdateList = new MyThread1(socket1, arrayList1,socket, socket2);
			// new thread for update the list of user name
			Thread thread2 = new Thread(myThreadUpdateList);
			thread2.start();
		}
	}

	public static void main(String[] args) {
		try {
			new MyServer();
		} catch (IOException exception) {
		}
	}
}

// It is used to update the list of user name
class MyThread1 implements Runnable {
	Socket socket1, socket, socket2;
	static ArrayList arrayList;
	DataInputStream dataInputStream;
	String stringName;

	MyThread1(Socket socket1, ArrayList arrayLIst1, Socket socket,Socket socket2) {
		this.socket1 = socket1;
		this.arrayList = arrayLIst1;
		this.socket = socket;
		this.socket2 = socket2;
	}

	public void run() {
		try {
			dataInputStream = new DataInputStream(socket1.getInputStream());
			while (true) {
				stringName = dataInputStream.readUTF();
				System.out.println("Exit :" + stringName);
				MyThread2.arrayListName.remove(stringName);// remove the logout
				// user name from arraylist
				MyThread2.every();
				arrayList.remove(socket1);
				MyThread.arayListReciveSend.remove(socket);
				MyThread2.arrayList2.remove(socket2);
				if (arrayList.isEmpty())
					System.exit(0); // all client has been logout

			}
		} catch (Exception exception) {
		}
	}
}

class MyThread2 implements Runnable {
	Socket socket2;
	static ArrayList arrayList2;
	static ArrayList arrayListName;
	static DataInputStream dataInputStream1;
	static DataOutputStream dataOutPutStream2;

	MyThread2(Socket socket2, ArrayList arrayList2, ArrayList alname) {
		this.socket2 = socket2;
		this.arrayList2 = arrayList2;
		this.arrayListName = alname;
	}

	public void run() {
		try {
			dataInputStream1 = new DataInputStream(socket2.getInputStream());
			arrayListName.add(dataInputStream1.readUTF()); // store the user
			// name in arraylist
			every();
		} catch (Exception exception) {
			System.out.println("Main expression" + exception);
		}
	}

	// send the list of user name to all client
	static void every() throws Exception {
		Iterator iterator1 = arrayList2.iterator();
		Socket socket1;
		while (iterator1.hasNext()) {
			socket1 = (Socket) iterator1.next();
			dataOutPutStream2 = new DataOutputStream(socket1.getOutputStream());
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(

					dataOutPutStream2);
			objectOutputStream.writeObject(arrayListName);
			// write the list of users in stream of all clients
			dataOutPutStream2.flush();
			objectOutputStream.flush();
		}
	}
}

// class is used to receive the message and send it to all clients
class MyThread implements Runnable {
	Socket socket;
	static ArrayList arayListReciveSend;
	DataInputStream dataInputStream;
	DataOutputStream dataOutPutStream;

	MyThread(Socket socket, ArrayList arrayList) {
		this.socket = socket;
		this.arayListReciveSend = arrayList;
	}

	public void run() {
		String string;
		int count = 1;
		try {
			dataInputStream = new DataInputStream(socket.getInputStream());
		} catch (Exception exception) {
		}

		while (count == 1) {
			try {
				string = dataInputStream.readUTF(); // read the message
				distribute(string);
			} catch (IOException exception) {
			}
		}
	}

	// send it to all clients
	public void distribute(String string) throws IOException {
		Iterator iterator = arayListReciveSend.iterator();
		Socket socket;
		while (iterator.hasNext()) {
			socket = (Socket) iterator.next();
			dataOutPutStream = new DataOutputStream(socket.getOutputStream());
			dataOutPutStream.writeUTF(string);
			dataOutPutStream.flush();
		}
	}

}
