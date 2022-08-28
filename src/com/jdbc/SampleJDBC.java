package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Load Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// Get Connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "9655348412");

		// Write a query
		String sql = "Select *from employees ";

		// Prepare a Query
		PreparedStatement st = con.prepareStatement(sql);

		// Execute Query
		ResultSet resultSet = st.executeQuery();

		// iterate the result
		while (resultSet.next()) {
			 String string = resultSet.getString("salary");
			System.out.println( string);
		}
		con.close();
		
		System.out.println("Tester - 1 ");
		
		
	}
}
