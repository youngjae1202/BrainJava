package com.malldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {
	public static void main(String args[]) {
		
		Connection ct = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
            // 3�ܰ�: ����̹��Ŵ��� Ŭ������ getConnection�޼ҵ�� DB�� �����Ѵ�.
            ct = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/malldb", "root", "12345");
            System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
            st = ct.createStatement();
            String sql = "delete from students where sname ='" + args[0] +"'";
            int chageRecord = st.executeUpdate(sql);
            ct.close();
            if(chageRecord>0) {
            	System.out.println(chageRecord + "���� ���� �Ǿ����ϴ�.");
            }else {
            	System.out.println("������ �����Ͱ� �����ϴ�.");
            }
            
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
