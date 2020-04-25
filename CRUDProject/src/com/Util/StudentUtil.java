package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentUtil {
   public static Connection createConnection() {
	   System.out.println("connection done");
	   Connection conn = null;
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return conn;
	 
   }
}
