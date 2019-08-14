package com.ca.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ApplicantDaoI {
	public int pushApplicantsToDatabase(Connection connection,HttpServletRequest request,HttpServletResponse response) throws SQLException;
}
