package com.ca.classes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ca.interfaces.StudentDaoI;


public class StudentImplementationDao implements StudentDaoI {
	
	public User getCredentials(Connection connection,int user_id, String password)
	{
		String template = "select * from login where user_id = ? and password = ?";
		User user = new User();
		try{
			PreparedStatement psmt = connection.prepareStatement(template);
			psmt.setInt(1, user_id);
			psmt.setString(2, password);
			
			ResultSet rs = psmt.executeQuery();
			if(rs.next()){
				user.setUser_id(rs.getInt("user_id"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
				return user;
			}
			else{
				return null;
			}
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return null;
	}

	}

	
	
	

	
	
