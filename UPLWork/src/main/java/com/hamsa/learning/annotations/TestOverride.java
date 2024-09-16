package com.hamsa.learning.annotations;

class DriverManager {
	public void getDriverManager() {
		System.out.println("Default Driver Manager");
	}
}

class MySQLDriver extends DriverManager {
	@Override
	public void getDriverManager() {
		System.out.println("MySQL Driver Manager");
	}
}

class PostgresDriver extends DriverManager {
	@Override
	public void getDriverManager() {
		System.out.println("PostgresSQL Driver Manager");
	}
}

public class TestOverride {
	public static void main(String args[]) {
		DriverManager driverManager = new MySQLDriver();
		driverManager.getDriverManager();
		driverManager = new PostgresDriver();
		driverManager.getDriverManager();
	}

}
