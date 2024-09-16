package com.hamsa.assignment11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MyClient extends WindowAdapter implements ActionListener {
	JFrame frame;
	JList list;
	JList list1;
	JTextField textField;
	DefaultListModel defaultListModelReceive;
	DefaultListModel defaultListModel1;
	JButton button1;
	JButton button2;
	JScrollPane scrollpane;
	JScrollPane scrollpane1;
	JLabel label;
	Socket socket, socket1, socket2;
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	DataOutputStream dataOutputStream1;
	DataOutputStream dataOutputStream2;
	DataInputStream dataInputStream2;
	String name;

	MyClient(String name) throws IOException {
		frame = new JFrame("Client Side");
		textField = new JTextField();
		defaultListModelReceive = new DefaultListModel();
		defaultListModel1 = new DefaultListModel();
		label = new JLabel("Message");
		list = new JList(defaultListModelReceive);
		list1 = new JList(defaultListModel1);
		button1 = new JButton("Send");
		button2 = new JButton("Logout");
		scrollpane = new JScrollPane(list);
		scrollpane1 = new JScrollPane(list1);
		JPanel panel = new JPanel();
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(textField);
		panel.add(button1);
		panel.add(scrollpane);
		panel.add(label);
		panel.add(button2);
		panel.add(scrollpane1);
		scrollpane.setBounds(10, 20, 180, 150);
		scrollpane1.setBounds(250, 20, 100, 150);
		label.setBounds(20, 180, 80, 30);
		textField.setBounds(100, 180, 140, 30);
		button1.setBounds(260, 180, 90, 30);
		button2.setBounds(260, 230, 90, 30);
		frame.add(panel);
		panel.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.name = name;
		frame.addWindowListener(this);
		socket = new Socket("localhost", 1004); // creates a socket object
		socket1 = new Socket("localhost", 1004);
		socket2 = new Socket("localhost", 1004);
		// create inputstream for a particular socket

		dataInputStream = new DataInputStream(socket.getInputStream());
		// create outputstream
		dataOutputStream = new DataOutputStream(socket.getOutputStream());
		// sending a message for login
		dataOutputStream.writeUTF(name + " has Logged in");
		dataOutputStream1 = new DataOutputStream(socket1.getOutputStream());
		dataOutputStream2 = new DataOutputStream(socket2.getOutputStream());
		dataInputStream2 = new DataInputStream(socket2.getInputStream());

		// creating a thread for maintaining the list of user name
		MyTheadCreatingName myTheadCreatingName = new MyTheadCreatingName(dataOutputStream2, defaultListModel1, name,
				dataInputStream2);
		Thread thread1 = new Thread(myTheadCreatingName);
		thread1.start();

		// creating a thread for receiving messages
		ReceiveTheMessage receiveTheMessage = new ReceiveTheMessage(dataInputStream, defaultListModelReceive);
		Thread threadReceive = new Thread(receiveTheMessage);
		threadReceive.start();

	}

	public void actionPerformed(ActionEvent e) {
		// sending the messages
		if (e.getSource() == button1) {
			String string = "";
			string = textField.getText();
			textField.setText("");
			string = name + ": > " + string;
			try {
				dataOutputStream.writeUTF(string);
				System.out.println(string);
				dataOutputStream.flush();
			} catch (IOException exception) {
				System.out.println(exception);
			}
		}
		// client logout
		if (e.getSource() == button2) {
			frame.dispose();
			try {
				// sending the message for logout
				dataOutputStream.writeUTF(name + " has Logged out");
				dataOutputStream1.writeUTF(name);
				dataOutputStream1.flush();
				Thread.currentThread().sleep(1000);
				System.exit(1);
			} catch (Exception exception) {
			}
		}
	}

	public void windowClosing(WindowEvent event) {
		try {
			dataOutputStream1.writeUTF(name);
			dataOutputStream1.flush();
			Thread.currentThread().sleep(1000);
			System.exit(1);
		} catch (Exception exception) {
		}
	}
}

// class is used to maintaning the list of user name
class MyTheadCreatingName implements Runnable {
	DataOutputStream dout1;
	DefaultListModel model1;
	DataInputStream din1;
	String name, lname;
	ArrayList arrayList = new ArrayList(); // stores the list of user names
	ObjectInputStream objectInputStream; // read the list of user names
	int count = 0;

	MyTheadCreatingName(DataOutputStream dataOutPutStream, DefaultListModel defaultListModel1, String name,
			DataInputStream dataInputStream1) {
		this.dout1 = dataOutPutStream;
		this.model1 = defaultListModel1;
		this.name = name;
		this.din1 = dataInputStream1;
	}

	public void run() {
		try {
			dout1.writeUTF(name); // write the user name in output stream
			while (true) {
				objectInputStream = new ObjectInputStream(din1);
				// read the list of user names
				arrayList = (ArrayList) objectInputStream.readObject();
				if (count > 0)
					model1.clear();
				Iterator iteratorObject = arrayList.iterator();
				System.out.println(arrayList);
				while (iteratorObject.hasNext()) {
					lname = (String) iteratorObject.next();
					count++;

					// add the user names in list box
					model1.addElement(lname);
				}
			}
		} catch (Exception exception) {
		}
	}
}

// class is used to receive the messages
class ReceiveTheMessage implements Runnable {
	DataInputStream din;
	DefaultListModel model;

	ReceiveTheMessage(DataInputStream din, DefaultListModel model) {
		this.din = din;
		this.model = model;
	}

	public void run() {
		String string = "";
		while (true) {
			try {
				string = din.readUTF(); // receive the message
				// add the message in list box
				model.addElement(string);
			} catch (Exception exception) {
			}
		}
	}

}
