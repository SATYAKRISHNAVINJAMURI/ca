package com.ca.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ca.interfaces.ApplicantDaoI;

public class ApplicantDao implements ApplicantDaoI{

	@Override
	public int pushApplicantsToDatabase(Connection connection, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		String query="insert into applicants (`name`,`course_name`,`phone_no`,`email`,`xth_marks`,`X11th_marks`,`entrance_marks`,`date_of_birth`) values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement ptmt=connection.prepareStatement(query)){
			System.out.println("enteredinto class");
			ptmt.setString(1,request.getParameter("uname"));
			ptmt.setString(2, request.getParameter("courseName"));
			ptmt.setString(3, request.getParameter("phonenum"));
			ptmt.setString(4, request.getParameter("uemail"));
			ptmt.setString(5, request.getParameter("10thmarks"));
			ptmt.setString(6, request.getParameter("12thmarks"));
			ptmt.setString(7, request.getParameter("entrancemarks"));
			ptmt.setString(8, request.getParameter("dob"));
			return ptmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
	}

}
