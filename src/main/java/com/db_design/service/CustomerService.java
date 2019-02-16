package com.db_design.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.db_design.util.DBConnection;

public class CustomerService {

	private Connection conn;

	// This method is used to register customer
	public boolean registerCustomer(String email, String password) {
		PreparedStatement ps = null;

		try {
			conn = DBConnection.getConnecton();
			String sql = "insert into user(email,password) values(?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);

			int result = ps.executeUpdate();

			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// This method is used to verify if the customer is registered
	// or not
	public boolean verifyUser(String email, String password) {
		conn = DBConnection.getConnecton();
		PreparedStatement ps = null;
		String sql = "select userID from user where email=? AND password=?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				if (rs.getString("userID") != null) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
