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
            // 3단계: 드라이버매니져 클래스는 getConnection메소드로 DB를 연결한다.
            ct = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/malldb", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
            st = ct.createStatement();
            String sql = "delete from students where sname ='" + args[0] +"'";
            int chageRecord = st.executeUpdate(sql);
            ct.close();
            if(chageRecord>0) {
            	System.out.println(chageRecord + "건이 수정 되었습니다.");
            }else {
            	System.out.println("삭제된 데이터가 없습니다.");
            }
            
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
