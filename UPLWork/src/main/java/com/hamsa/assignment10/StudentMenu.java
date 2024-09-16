package com.hamsa.assignment10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class StudentMenu implements ActionListener {
	private JFrame frameObject;
	private MenuItem loginFormMenu;
	private MenuItem studentMenu, facultyMenu, courseMenu;
	private MenuItem resultMenu;
	private MenuItem exitMenu;
	private Menu loginMainMenu;
	private Menu studentMainMenu;
	private Menu displayMainMenu;
	private Menu exitMainMenu;

	StudentMenu() {
// Menu Object
		loginMainMenu = new Menu("Login");
		studentMainMenu = new Menu("Student");
		displayMainMenu = new Menu("Display");
		exitMainMenu = new Menu("Exit");

// Menu Item's
		loginFormMenu = new MenuItem("Login Form");
		studentMenu = new MenuItem("Student Mark Sheet");
		studentMenu.addActionListener(this);
		facultyMenu = new MenuItem("Faculty");
		courseMenu = new MenuItem("Course");
		resultMenu = new MenuItem("Result");
		exitMenu = new MenuItem("Exit Form");
		exitMenu.addActionListener(this);

// Menu Bar
		MenuBar menuBar = new MenuBar();
		menuBar.add(loginMainMenu);
		menuBar.add(studentMainMenu);
		menuBar.add(displayMainMenu);
		menuBar.add(exitMainMenu);

// Adding Menu Item to Menu object
		loginMainMenu.add(loginFormMenu);
		studentMainMenu.add(studentMenu);
		studentMainMenu.add(facultyMenu);
		studentMainMenu.add(courseMenu);
		displayMainMenu.add(resultMenu);
		exitMainMenu.add(exitMenu);

// Create Frame
		frameObject = new JFrame("Home Page");
		frameObject.setMenuBar(menuBar);
		frameObject.setSize(400, 400);
		frameObject.setVisible(true);
		frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent actionEvent) {
		if (actionEvent.getSource() == studentMenu) {
			new StudentResult();
		}
		if (actionEvent.getSource() == exitMenu) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new StudentMenu();
	}
}