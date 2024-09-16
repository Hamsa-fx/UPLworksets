package com.hamsa.assignment10;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyCalculator {
	public static void main(String[] args) {
		new Calculator1();
	}
}

class Calculator1 extends JFrame {
	private JLabel firstNumber, secondNumber, result;
	private JTextField firstField, secondField, resultField;
	private JButton addition, subtract, multiply, divide, modulas, clear;
	private Toolkit toolkit;

	Calculator1() {
		initComponents();
	}

	public void initComponents() {
		firstNumber = new JLabel();
		secondNumber = new JLabel();
		result = new JLabel();
		firstField = new JTextField();
		secondField = new JTextField();
		resultField = new JTextField();
		addition = new JButton();
		subtract = new JButton();
		multiply = new JButton();
		divide = new JButton();
		modulas = new JButton();
		clear = new JButton();

		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		setTitle("MyCalcuator");

		firstNumber.setText("First Number");
		getContentPane().add(firstNumber);
		firstNumber.setBounds(10, 10, 100, 20);
		secondNumber.setText("Second Number");
		getContentPane().add(secondNumber);
		secondNumber.setBounds(10, 40, 100, 20);

		result.setText("Result");
		getContentPane().add(result);
		result.setBounds(10, 70, 100, 20);

		getContentPane().add(firstField);
		firstField.setBounds(130, 10, 100, 20);

		getContentPane().add(secondField);
		secondField.setBounds(130, 40, 100, 20);

		getContentPane().add(resultField);
		resultField.setBounds(130, 70, 100, 20);

		addition.setText("Addition");
		getContentPane().add(addition);
		addition.setBounds(3, 100, 85, 30);
		ActionListener add = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (actionEvent.getSource() == addition) {
					float number1 = Integer.parseInt(firstField.getText());
					float number2 = Integer.parseInt(secondField.getText());
					float result = number1 + number2;
					resultField.setText(String.valueOf(result));
				}
			}
		};
		addition.addActionListener(add);
		subtract.setText("Subtract");
		getContentPane().add(subtract);
		subtract.setBounds(103, 100, 85, 30);
		ActionListener subtraction = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (actionEvent.getSource() == subtract) {
					float number1 = Integer.parseInt(firstField.getText());
					float number2 = Integer.parseInt(secondField.getText());
					float result = number1 - number2;
					resultField.setText(String.valueOf(result));
				}
			}
		};
		subtract.addActionListener(subtraction);
		multiply.setText("Multiply");
		getContentPane().add(multiply);
		multiply.setBounds(203, 100, 85, 30);
		ActionListener multiplication = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (actionEvent.getSource() == multiply) {
					float number1 = Integer.parseInt(firstField.getText());
					float number2 = Integer.parseInt(secondField.getText());
					float result = number1 * number2;
					resultField.setText(String.valueOf(result));
				}
			}
		};
		multiply.addActionListener(multiplication);
		divide.setText("Divide");
		getContentPane().add(divide);
		divide.setBounds(3, 140, 85, 30);
		ActionListener division = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (actionEvent.getSource() == divide) {
					float number1 = Integer.parseInt(firstField.getText());
					float number2 = Integer.parseInt(secondField.getText());
					float result = number1 / number2;
					resultField.setText(String.valueOf(result));
				}
			}
		};
		divide.addActionListener(division);
		modulas.setText("Mod");
		getContentPane().add(modulas);
		modulas.setBounds(103, 140, 85, 30);
		ActionListener mod = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (actionEvent.getSource() == modulas) {
					float number1 = Integer.parseInt(firstField.getText());
					float number2 = Integer.parseInt(secondField.getText());
					float result = number1 % number2;
					resultField.setText(String.valueOf(result));
				}
			}
		};
		modulas.addActionListener(mod);
		clear.setText("Clear");
		getContentPane().add(clear);
		clear.setBounds(203, 140, 85, 30);
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (actionEvent.getSource() == clear) {
					firstField.setText("");
					secondField.setText("");
					resultField.setText("");
				}
			}
		};
		clear.addActionListener(actionListener);
		pack();
		setSize(300, 210);
		setLocation(10, 10);
		toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation((size.width - getWidth()) / 2, (size.height - getHeight()) / 2);
		setVisible(true);
	}
}
