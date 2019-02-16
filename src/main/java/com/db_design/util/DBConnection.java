package com.db_design.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Harsh Verma
 * 
 *         This is a singleton class to create DB Connection
 */
public class DBConnection {

	private static Connection conn;

	// Private Constructor can only be accessed by the singleton class
	// using static factory method
	private DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thepirateshop", "root",
					"");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Static Factory Method
	@SuppressWarnings("static-access")
	public static Connection getConnecton() {
		if (conn != null) {
			return conn;
		} else {
			return new DBConnection().conn;
		}
	}
}
