package com.ca.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	public static Connection connection;
	public static Connection getConnection() throws IOException {
		try{
			FileInputStream fis=new FileInputStream("db.properties");
			Properties props=new Properties();
			props.load(fis);
			String jdbcDriver =props.getProperty("jdbc.driver");
			String dbUrl=props.getProperty("db.url");
			String dbUser=props.getProperty("db.user");
			String dbPassword=props.getProperty("db.password");
			Class.forName(jdbcDriver);
			connection=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
				if(connection!=null)
//					System.out.println("connection succesfull");
					return connection;
			} catch (SQLException|ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
//				System.out.println("failure");
			}
		
	return connection;

}
}