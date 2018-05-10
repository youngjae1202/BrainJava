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
      //1�ܰ� : DB ������ ���� Ŀ�ؼ� �������̽�
        Connection conn = null;   
        Statement stmt = null;
        ResultSet rs = null;
      
        //try ~catch������ DB�����߿� ���ܰ� �߻��ϴ����� �˻�.
        try {
           //2�ܰ� : JDBC����̹��� �ε��Ѵ�.
            Class.forName("com.mysql.jdbc.Driver");
            //3�ܰ� : ����̹��Ŵ��� Ŭ������ getConnection�޼ҵ�� DB�� �����Ѵ�.
            conn = DriverManager.getConnection(   
               "jdbc:mysql://localhost:3306/malldb", "root", "12345");
            System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
            //4�ܰ� : DB������ �����Ѵ�.
           
         stmt = conn.createStatement();
         // DML SQL���� ����
         rs = stmt.executeQuery("select now()");   
         
         if(rs.next()) {
            System.out.println(rs.getString(1));
            
         }
         
            conn.close();
            
        }
        //����ó���� ū���ִ� �ؿ� �ΰ� ���� ������ ���� �ۼ��س��´�.
        catch (ClassNotFoundException cnfe) {
            System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

}