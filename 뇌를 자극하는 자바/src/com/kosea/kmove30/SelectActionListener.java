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
	
	//�Ӽ�
	JTable table;
	JDBC_Manager jdbcManager;
	ResultSet rs;
	//������
	public SelectActionListener(JDBC_Manager jdbcManager,JTable table) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
	}
	//�޼ҵ�
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
		//��ȸ�� ����� 1�� �̻� ������
		
		ResultSetMetaData md = rs.getMetaData();
		int columCount = md.getColumnCount();
		System.out.println("�÷� ����" +columCount);
		
		rs.last(); //���ڵ� �¿� ������ ������ �̵�
		
		int rowCount= rs.getRow(); // ���ڵ� ����
		rs.beforeFirst();//���ڵ� Ŀ���� ó�� ������ �̵�
		System.out.println("���ڵ尹��" + rowCount);
		//��ȸ�� ����� 1�� �̻� ������
		if(rowCount >=1) {
		while(rs.next()) {
			arr[0] = rs.getString("pname");
			arr[1] = "25";
			arr[2] = rs.getString("gender");
					
			//arr[2] = (rs.getString("gender").equals("m")?"��":"��");
			System.out.println(arr[0]+""+arr[1]+""+arr[2]);
			model.addRow(arr);
		}
		}else {//��ȣ�� ����� ������
			JOptionPane.showMessageDialog(null, "��� �޽��� ����", "��ȸ�� ����� �����ϴ�.", JOptionPane.WARNING_MESSAGE);
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
