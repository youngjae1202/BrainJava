package com.kosea.kmove30;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WindowProject {
	JDBC_Mamber jdbcMaber;
	LoginView loginView;
	WindowExample8_2 windowExample;
	public void showFrameTest(){
		 jdbcMaber.dispose(); // 로그인창닫기
	        new WindowExample8_2();  // 테스트프레임 오픈
	    }
	
	public static void main(String[] args) {
		WindowProject main = new WindowProject();
		main.jdbcMaber = new JDBC_Mamber(); // 로그인창 보이기
		  main.jdbcMaber.setMain(main);
		
	}
	 

}
