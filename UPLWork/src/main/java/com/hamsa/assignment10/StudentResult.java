package com.hamsa.assignment10;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentResult implements ActionListener {
	private JFrame frame;
	private JLabel labelStudentName;
	private JLabel labelStudentAge;
	private JLabel labelStudentId, labelTotalMarks, courseLabel, resultLabel;
	private JPanel panel;
	private JTextField studentNameTextField, totalMarksTextField;
	private JTextField studentAgeTextField;
	private JTextField studentIdTextField;
	private JComboBox courseCombo, resultCombo;
	private JButton addButton;

	DefaultTableModel defaultTableMode;

	StudentResult() {
		frame = new JFrame("Student Information");

		labelStudentName = new JLabel("Student Name");
		studentNameTextField = new JTextField();

		courseLabel = new JLabel("Course");
		resultLabel = new JLabel("Result");
		courseCombo = new JComboBox();
		courseCombo.addItem(new String("M.B.A"));
		courseCombo.addItem(new String("M.C.A"));
		courseCombo.addItem(new String("M.Sc"));
		courseCombo.addItem(new String("M.TECH"));

		resultCombo = new JComboBox();
		resultCombo.addItem(new String("Pass"));
		resultCombo.addItem(new String("Fail"));

		labelStudentAge = new JLabel("Student Age");
		studentAgeTextField = new JTextField();

		labelStudentId = new JLabel("Student ID");
		studentIdTextField = new JTextField();

		labelTotalMarks = new JLabel("Total Marks");
		totalMarksTextField = new JTextField();
		addButton = new JButton("Add");
		addButton.addActionListener(this);

		studentNameTextField.setBounds(120, 30, 100, 25);
		labelStudentName.setBounds(25, 25, 100, 30);

		courseLabel.setBounds(230, 27, 150, 25);
		courseCombo.setBounds(290, 27, 100, 23);
		resultLabel.setBounds(230, 67, 150, 25);
		resultCombo.setBounds(290, 67, 100, 23);

		labelStudentAge.setBounds(25, 70, 150, 25);
		studentAgeTextField.setBounds(120, 70, 100, 25);

		labelStudentId.setBounds(25, 110, 150, 25);
		studentIdTextField.setBounds(120, 110, 100, 25);

		labelTotalMarks.setBounds(25, 150, 150, 25);
		totalMarksTextField.setBounds(120, 150, 100, 25);

		addButton.setBounds(160, 200, 80, 30);
		panel = new JPanel();
		panel.add(studentNameTextField);
		panel.add(labelStudentName);
		panel.add(studentAgeTextField);
		panel.add(labelStudentAge);
		panel.add(labelStudentId);
		panel.add(studentIdTextField);
		panel.add(labelTotalMarks);
		panel.add(totalMarksTextField);
		panel.add(courseLabel);
		panel.add(courseCombo);
		panel.add(resultCombo);
		panel.add(resultLabel);
		panel.add(addButton);
		panel.setLayout(null);
		frame.add(panel);
		frame.setSize(450, 320);
		frame.setVisible(true);
	}

public void actionPerformed( ActionEvent ae) {
if(ae.getSource() == addButton) {
try {
DatabaseConnection databaseConnection = new DatabaseConnection();
Connection connection databaseConnection.getDatabaseConnection ();
String studentNa = studentNameTextField.getText();
String studentAg = studentAgeTextField.getText();
String studentId = studentIdTextField.getText();
String totalMarks = totalMarksTextField.getText();
String comboCourse = courseCombo.getSelectedItem().toString();
String comboResult = resultCombo.getSelectedItem().toString();

PreparedStatement preparedStatement = connection.prepareStatement
("INSERT INTO "
+"student_details(studentname,studentage,studentid,totalmarks,course,r
esult) VALUES(?,?,?,?,?,?)");
preparedStatement.setString(1, studentNa);
preparedStatement.setString(2, studentAg);
preparedStatement.setString(3, studentId);
preparedStatement.setString(4, totalMarks);
preparedStatement.setString(5, comboCourse);
preparedStatement.setString (6, comboResult);
preparedStatement.executeUpdate ();
JOptionPane.showMessageDialog ((Component)null,"Details Added Successfully"," Information...",
   JOptionPane.INFORMATION_MESSAGE);

} catch (SQLException sqle) {
sqle.printStackTrace();
}
}
}
}
