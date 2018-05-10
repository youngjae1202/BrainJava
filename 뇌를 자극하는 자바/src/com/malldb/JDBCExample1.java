package com.malldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JDBCExample1 {
   public static void main(String args[]) {
      //1단계 : DB 연결을 위한 커넥션 인터페이스
        Connection conn = null;   
        Statement stmt = null;
        ResultSet rs = null;
      
        //try ~catch문에서 DB연결중에 예외가 발생하는지를 검사.
        try {
           //2단계 : JDBC드라이버를 로드한다.
            Class.forName("com.mysql.jdbc.Driver");
            //3단계 : 드라이버매니저 클래스는 getConnection메소드로 DB를 연결한다.
            conn = DriverManager.getConnection(   
               "jdbc:mysql://localhost:3306/malldb", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
            //4단계 : DB연결을 종료한다.
           
         stmt = conn.createStatement();
         // DML SQL쿼리 실행
         rs = stmt.executeQuery("select now()");   
         
         if(rs.next()) {
            System.out.println(rs.getString(1));
            
         }
         
            conn.close();
            
        }
        //예외처리도 큰범주는 밑에 두고 좁은 범위는 위로 작성해놓는다.
        catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

}