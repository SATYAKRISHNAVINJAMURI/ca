package com.ca.classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ca.interfaces.User;
import com.ca.servlets.Ca;

public class StudentImplementationDao implements User {
	
		private String dbUrl="jdbc:mysql://10.7.177.21:3306/ca";
		private String dbUser="causer";
		private String dbPass="capass";
		private String dbDriver="com.mysql.jdbc.Driver";
	
	private Connection connection;
	User user;
	try {
		Class.forName(driverClass);
		connection = DriverManager.getConnection(dbUrl,dbUser,dbPass);
	}
	catch (ClassNotFoundException | SQLException e) {
		System.out.println(e);
	}
	
	public User getCredentials(String user_id, String password, String role)
	{
		String template = "select * from login";
		user = new StudentImplementationDao();
		
		try(PreparedStatement pstmt = connection.prepareStatement(template)){
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setString(4, book.getPrice());
			pstmt.setString(5, book.getStock());
		return null;
	}
	
}
}
	

	
	
