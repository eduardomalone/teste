package br.com.projeto.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	// 
	private static final String URL = "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS01;databaseName=teste";
	private static final String USER = "eduardo";
	private static final String PASSWORD = "eduardo";
	
	public Connection getConnection() throws Exception {
		
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection( 
				"jdbc:sqlserver://DESKTOP-K6CSNT9\\SQLEXPRESS01;databaseName=teste",
				USER, PASSWORD
				);
		
		return connection;
		
	}

}