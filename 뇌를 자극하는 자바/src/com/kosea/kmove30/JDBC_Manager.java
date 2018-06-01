package com.kosea.kmove30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Manager {

	// �Ӽ�(�ʵ�)
	// 1�ܰ�: DB ������ ���� Ŀ�ؼ� �������̽�
	Connection conn = null;
	// Statement �������̽� - SQL ����.
	Statement stmt = null;
	// ResultSet �������̽� - SQL ����� ���� select �������� ���ȴ�
	ResultSet rs = null;

	// ������ ����
	public JDBC_Manager(Connection conn, Statement stmt, ResultSet rs) {
		super();
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}

	public JDBC_Manager() {
		System.out.println("JDBC Manager() �⺻ ������ ȣ��");
	}

	// DB ����
	public Connection DBConnection(String driver, String url, String user, String pass) throws Exception {
		Class.forName(driver);// JDBC����̹��� �ε��Ѵ�.
		conn = DriverManager.getConnection(url, user, pass);
		return conn;
	}// query- "insert into person(pname,age,gender)values("ȫ�浿",42,"m");

	public void insertTable(String[] arr) throws Exception {

		String name = arr[0];
		String age = arr[1];
		String gender = arr[2];
		//�޺��ڽ��� ���̸� ->"m" ���̸� "f"
		gender = gender.equals("��")?"m":"f";
		
		String query = "Insert into person(pname,age,gender)values" + "('" + name + "'," + age + ",'" + gender + "'"
				+ ")";
		System.out.println("query - " + query);
		stmt = conn.createStatement();
		int insertCount = stmt.executeUpdate(query);

		if (insertCount > 0) {
			System.out.println(insertCount + "���� ���� �Ǿ����ϴ�.");
		}

	}

	// query - "select pname, age, gender from person"
	public ResultSet selectTable(String query) throws Exception {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		return rs;
	}

	public void updateTable(String name,String age) throws Exception {
		String query = "update person set age =" + age + 
				" where pname ='"+name+"'";
		stmt = conn.createStatement();
		System.out.println(query);
		int updateCount = stmt.executeUpdate(query);
		if (updateCount > 0) {
			System.out.println(updateCount + "���� ���� �Ǿ����ϴ�.");
		}
			
	}

	public void deleteTable(String deleteName) throws Exception {// DB����
		String query = "delete from person where pname = '" + deleteName + "'";
		stmt = conn.createStatement();
		int deleteCount = stmt.executeUpdate(query);
		if (deleteCount > 0)
			System.out.println(deleteCount + "���� ���� �Ǿ����ϴ�.");
	}

	// DB ���� ����
	public void DBClose() throws Exception {// DB����� ���� ���� �������� ����ó��
		conn.close();
	}

}
