package com.malldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {
	public static void main(String args[]) {
		
		Connection ct = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ct = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/malldb", "root", "12345");
		
			st = ct.createStatement();
			String sql = "INSERT INTO students ( sname, sclass, sbunho)" + 
            		"values('이상구','2-4','3');";
			  int chageRecord = st.executeUpdate(sql);
			  
			  ct.close();
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + 
                    cnfe.getMessage());
		}
		 catch (SQLException se) {
	            System.out.println(se.getMessage());
	        }
		
		
	}
}
