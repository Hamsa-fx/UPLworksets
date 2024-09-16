package com.hamsa.assignment10;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
//import javax.swing.table.DefaultTableModel;

public class GuiCopyDirectory implements ActionListener {
	private JFrame frame;
	private JLabel labelSourceFileDirectory;
	private JLabel labelDestinationFileDirectory;
	//private JLabel labelStudentId, labelTotalMarks;
	private JPanel panel;
	private JTextField sourceFileDirectoryTextField;
	private JTextField studentAgeTextField;
	private JButton addButton;

	GuiCopyDirectory() {
		frame = new JFrame("Student Information");

		labelSourceFileDirectory = new JLabel("Source File Directory");
		sourceFileDirectoryTextField = new JTextField();

		labelDestinationFileDirectory = new JLabel("Destination File Directory");
		studentAgeTextField = new JTextField();

		addButton = new JButton("Add");
		addButton.addActionListener(this);

		sourceFileDirectoryTextField.setBounds(190, 30, 140, 25);
		labelSourceFileDirectory.setBounds(25, 25, 140, 30);

		labelDestinationFileDirectory.setBounds(25, 90, 150, 25);
		studentAgeTextField.setBounds(190, 90, 140, 25);
		addButton.setBounds(160, 200, 80, 30);
		panel = new JPanel();
		panel.add(sourceFileDirectoryTextField);
		panel.add(labelSourceFileDirectory);
		panel.add(studentAgeTextField);
		panel.add(labelDestinationFileDirectory);
		panel.add(addButton);

		panel.setLayout(null);
		frame.add(panel);
		frame.setSize(450, 320);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == addButton) {
			try {
				String sourceFileDir = sourceFileDirectoryTextField.getText();
				String destinationFileDir = studentAgeTextField.getText();
				GuiCopyDirectory copyDirectory = new GuiCopyDirectory();
				File sourceFile = new File(sourceFileDir);
				File destinationFile = new File(destinationFileDir);
				copyDirectory.copyDirectory(sourceFile, destinationFile);
			} catch (Exception sqle) {
				sqle.printStackTrace();
			}
		}
	}

	public static void main(String arg[]) {
		new GuiCopyDirectory();
	}

	public void copyDirectory(File sourcePath, File destinationPath) throws IOException {
		if (sourcePath.isDirectory()) {
		if ( !destinationPath.exists()) {
		destinationPath.mkdir();
		}
		String files[] = sourcePath.list();
		for(int count = 0; count < files.length; count++) {
		copyDirectory (new File(sourcePath, files[count]), new File(destinationPath, files[count]));

		}
		} else {
		if( !sourcePath.exists() ) {
		System.out.println("File or directory does not exist.");
		System.exit(0);

		} else {
		InputStream inputStream = new FileInputStream (sourcePath);
		OutputStream outputStream = new FileOutputStream (destinationPath);
		//Transfer bytes from in to out
		byte[] byteSize = new byte[1024];
		int length;
		while ((length = inputStream.read(byteSize)) > 0) {
		outputStream.write(byteSize, 0, length);
		}
		inputStream.close();
		outputStream.close();
		}
		}
		JOptionPane.showMessageDialog((Component)null,"File Copied Successfully","information ...", JOptionPane.INFORMATION_MESSAGE);

		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}
