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
            		"values('�̻�','2-4','3');";
			  int chageRecord = st.executeUpdate(sql);
			  
			  ct.close();
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + 
                    cnfe.getMessage());
		}
		 catch (SQLException se) {
	            System.out.println(se.getMessage());
	        }
		
		
	}
}
