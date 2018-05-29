package com.kosea.kmove30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SelectActionListener implements ActionListener {
	
	//속성
	JTable table;
	JDBC_Manager jdbcManager;
	ResultSet rs;
	//생성자
	public SelectActionListener(JDBC_Manager jdbcManager,JTable table) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
	}
	//메소드
	@Override
	public void actionPerformed(ActionEvent e) {
	String query = "select jumincd, pname,	gender, age  from person";
	String arr[] = new String[3];
//	arr[0] = text1.getText();
//	arr[1] = text2.getText();
//	arr[2] = text3.getText();
	DefaultTableModel model = (DefaultTableModel) table.getModel();
	try {
		rs = jdbcManager.selectTable(query);
		model.setNumRows(0);
		//조회된 결과가 1건 이상 있을시
		
		ResultSetMetaData md = rs.getMetaData();
		int columCount = md.getColumnCount();
		System.out.println("컬럼 개수" +columCount);
		
		rs.last(); //레코드 셋에 마지막 행으로 이동
		
		int rowCount= rs.getRow(); // 레코드 갯수
		rs.beforeFirst();//레코드 커서를 처음 행으로 이동
		System.out.println("레코드갯수" + rowCount);
		//조회된 결과가 1건 이상 있을시
		if(rowCount >=1) {
		while(rs.next()) {
			arr[0] = rs.getString("pname");
			arr[1] = "25";
			arr[2] = rs.getString("gender");
					
			//arr[2] = (rs.getString("gender").equals("m")?"남":"여");
			System.out.println(arr[0]+""+arr[1]+""+arr[2]);
			model.addRow(arr);
		}
		}else {//조호된 결과가 없을시
			JOptionPane.showMessageDialog(null, "경고 메시지 내용", "조회된 결과가 없습니다.", JOptionPane.WARNING_MESSAGE);
		}
	}catch(Exception ex) {
		ex.getMessage();
	}
	//int row = table.getSelectedRow();
	//int col = table.getSelectedColumn();
	//Object value = table.getValueAt(0,0);
	//System.out.println((String)value);
	}
}
