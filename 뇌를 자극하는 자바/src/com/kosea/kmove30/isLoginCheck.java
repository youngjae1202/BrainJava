package com.kosea.kmove30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class isLoginCheck implements ActionListener {
	JDBC_Manager jdbcmanager;
	JTextField userText;
	JPasswordField passText;
	ResultSet rs;
	LoginView loginView;

	public isLoginCheck(JDBC_Manager jdbcmanager, JTextField userText, JPasswordField passText) {
	      super();
	      this.jdbcmanager = jdbcmanager;
	      this.userText = userText;
	      this.passText = passText;
	   }

	@Override
	   public void actionPerformed(ActionEvent e) {
	      String query = "select id, pw from member";
	      try {
	         rs = jdbcmanager.selectTable(query);
	         while (rs.next()) {
	            String idText = rs.getString("id");
	            String pwText = rs.getString("pw");
	            if (userText.getText().equals(idText)) {
	               System.out.println("���̵� ����");
	               if (new String(passText.getPassword()).equals(pwText)) {
	                  System.out.println("��й�ȣ ����");
	                  loginView.dispose();
	                  new WindowExample8_2();
	               } 
	               }
	          }
	         }catch (Exception e1) {

	             e1.printStackTrace();
	      }
	}
}

