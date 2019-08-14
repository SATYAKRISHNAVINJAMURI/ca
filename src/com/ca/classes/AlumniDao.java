package com.ca.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ca.interfaces.AlumniDaoI;

public class AlumniDao implements AlumniDaoI {
	public List<Alumni> getAlumni(Connection connection, String name) throws SQLException{
		PreparedStatement psmt = null;
		if(name == null){
			String template = "select * from alumni";
			psmt = connection.prepareStatement(template);
		}else{
			String template = "select * from alumni where name like ?";
			psmt = connection.prepareStatement(template);
			psmt.setString(1,"%" + name + "%");
		}

		Alumni al = new Alumni();
		List<Alumni> al_list = new ArrayList<>();
		try{
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
