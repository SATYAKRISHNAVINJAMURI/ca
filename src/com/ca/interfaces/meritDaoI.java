package com.ca.interfaces;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface meritDaoI {
	public void displayMeritList(Connection connection,HttpServletRequest request, HttpServletResponse response);
}
