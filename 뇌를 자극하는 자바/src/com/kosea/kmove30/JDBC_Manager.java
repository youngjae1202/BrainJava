package com.kosea.kmove30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Manager {

	// 속성(필드)
	// 1단계: DB 연결을 위한 커넥션 인터페이스
	Connection conn = null;
	// Statement 인터페이스 - SQL 실행.
	Statement stmt = null;
	// ResultSet 인터페이스 - SQL 결과를 저장 select 문에서만 사용된다
	ResultSet rs = null;

	// 생성자 생성
	public JDBC_Manager(Connection conn, Statement stmt, ResultSet rs) {
		super();
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}

	public JDBC_Manager() {
		System.out.println("JDBC Manager() 기본 생성자 호출");
	}

	// DB 연결
	public Connection DBConnection(String driver, String url, String user, String pass) throws Exception {
		Class.forName(driver);// JDBC드라이버를 로드한다.
		conn = DriverManager.getConnection(url, user, pass);
		return conn;
	}// query- "insert into person(pname,age,gender)values("홍길동",42,"m");

	public void insertTable(String[] arr) throws Exception {

		String name = arr[0];
		String age = arr[1];
		String gender = arr[2];
		//콤보박스에 남이면 ->"m" 여이면 "f"
		gender = gender.equals("남")?"m":"f";
		
		String query = "Insert into person(pname,age,gender)values" + "('" + name + "'," + age + ",'" + gender + "'"
				+ ")";
		System.out.println("query - " + query);
		stmt = conn.createStatement();
		int insertCount = stmt.executeUpdate(query);

		if (insertCount > 0) {
			System.out.println(insertCount + "건이 삽입 되었습니다.");
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
			System.out.println(updateCount + "건이 수정 되었습니다.");
		}
			
	}

	public void deleteTable(String deleteName) throws Exception {// DB삭제
		String query = "delete from person where pname = '" + deleteName + "'";
		stmt = conn.createStatement();
		int deleteCount = stmt.executeUpdate(query);
		if (deleteCount > 0)
			System.out.println(deleteCount + "건이 삭제 되었습니다.");
	}

	// DB 연결 해지
	public void DBClose() throws Exception {// DB종료시 오류 날수 있음으로 예외처리
		conn.close();
	}

}
