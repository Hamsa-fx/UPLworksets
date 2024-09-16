package com.hamsa.assignment10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public Connection getDatabaseConnection() throws SQLException {
		Connection connection = null;
		try {
		System.out.println("In Database connection");
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		connection = DriverManager.getConnection("jdbc:odbc:snipedsn");
		return connection;
		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
			return null;
			} catch (SQLException sqlException) {
			sqlException.printStackTrace ();
			return null;
			}
	}

}
