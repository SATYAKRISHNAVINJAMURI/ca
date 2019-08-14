package com.ca.classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ca.interfaces.User;
import com.ca.servlets.Ca;

public class StudentImplementationDao implements User {
	
	public User getCredentials(Connection connection,String user_id, String password, String role)
	{
		String template = "select * from login";
		User user;
		user = new StudentImplementationDao();
		
		try{
			PreparedStatement psmt = connection.prepareStatement(template);
			psmt.setString(1, user_id);
			psmt.setString(2, password);
			psmt.setString(3, role);
			
			ResultSet rs = psmt.executeQuery();
			if(rs.next())
			{
				public void setUser_id(int user_id) {
					user.setUser_id(rs.getString("user_id"));
				}

				
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
				//System.out.println(user.getEmail());
				return user;
			}
			
			else
			{
				return null;
			}
			}catch(SQLException e)
			{
			System.out.println(e);
			}
		return null;
	}

	
	
	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRole(String role) {
		// TODO Auto-generated method stub
		
	}
	
}
}
	

	
	
