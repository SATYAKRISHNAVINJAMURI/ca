package com.ca.classes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public List<Event> getEvents(Connection connection) {
		// TODO Auto-generated method stub
		try{
			String template = "select * from events";
			PreparedStatement psmt = connection.prepareStatement(template);
			Event ev = new Event();
			List<Event> ev_list = new ArrayList<>();
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				ev.setName(rs.getString("event_name"));
				ev.setDescription(rs.getString("description"));
				ev.setVenue(rs.getString("venue"));
				ev.setTime(rs.getTime("time"));
				ev_list.add(ev);
			}
			return ev_list;
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return null;
	}
	
	


	}

	
	
	

	
	
