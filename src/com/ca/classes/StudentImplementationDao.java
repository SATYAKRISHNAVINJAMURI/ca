package com.ca.classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ca.interfaces.User;
import com.ca.servlets.Ca;

public class StudentImplementationDao implements User {
	
	public User getCredentials(Connection connection,String user_id, String password, String role)
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
	

	
	
