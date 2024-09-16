package com.hamsa.assignment11;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login implements ActionListener {
	JFrame frame1;
	JTextField textField;
	JButton button;
	JLabel heading;
	JLabel label;

	public static void main(String[] args) {
		new Login();
	}

	public Login() {
		frame1 = new JFrame("Login Page");
		textField = new JTextField();
		button = new JButton("Login");
		heading = new JLabel("Intranet Online Communication System");
		heading.setFont(new Font("Impact", Font.BOLD, 40));
		label = new JLabel("Enter you Login Name");
		label.setFont(new Font("Serif", Font.PLAIN, 24));
		JPanel panel = new JPanel();
		button.addActionListener(this);
		panel.add(heading);
		panel.add(textField);
		panel.add(label);
		panel.add(button);
		heading.setBounds(20, 20, 950, 30);
		label.setBounds(20, 100, 250, 60);
		textField.setBounds(50, 150, 150, 30);
		button.setBounds(70, 200, 90, 30);
		frame1.add(panel);
		panel.setLayout(null);
		frame1.setSize(300, 300);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// pass the user name to MyClient class
	public void actionPerformed(ActionEvent actionEvent) {
		String name = "";
		try {
			name = textField.getText();
			frame1.dispose();
			MyClient myClient = new MyClient(name);
		} catch (IOException exception) {
		}
	}
}
