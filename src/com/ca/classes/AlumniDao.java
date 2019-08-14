package com.ca.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ca.interfaces.AlumniDaoI;

public class AlumniDao implements AlumniDaoI {
	public Alumni getAlumni(Connection connection, String name){
		String template = "select * from alumni where name like  ?";
		Alumni al = new Alumni();
		try{
			PreparedStatement psmt = connection.prepareStatement(template);
			psmt.setString(1, name);
			
			ResultSet rs = psmt.executeQuery();
			if(rs.next()){
				al.setUser_id(rs.getInt("student_id"));
				al.setName(rs.getString("name"));
				al.setEmail(rs.getString("email"));
				al.setYearOfJoining(rs.getDate("year_of_joining"));
				al.setYearOfLeaving(rs.getDate("year_of_leaving"));
				al.setDepartment(rs.getString("department"));
				return al;
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
	
	public List<Alumni> getAllAlumni(Connection connection){
		String template = "select * from alumni";
		Alumni al = new Alumni();
		List<Alumni> al_list = new ArrayList<>();
		try{
			PreparedStatement psmt = connection.prepareStatement(template);
			
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				al.setUser_id(rs.getInt("student_id"));
				al.setName(rs.getString("name"));
				al.setEmail(rs.getString("email"));
				al.setYearOfJoining(rs.getDate("year_of_joining"));
				al.setYearOfLeaving(rs.getDate("year_of_leaving"));
				al.setDepartment(rs.getString("department"));
				al_list.add(al);
			}
			return al_list;
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return null;
		
	}

}
