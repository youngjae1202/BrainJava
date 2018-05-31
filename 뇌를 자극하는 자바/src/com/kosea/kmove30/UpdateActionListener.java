package com.kosea.kmove30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class UpdateActionListener implements ActionListener {
	JTable table;
	JDBC_Manager jdbcManager;
	JTextField text1,text2; // JTextField textAge




	public UpdateActionListener(JTable table, JDBC_Manager jdbcManager, JTextField text1, JTextField text2) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
		this.text1 = text1;
		this.text2 = text2;
	}




	@Override
	public void actionPerformed(ActionEvent e)  {
		 int row = table.getSelectedRow();
		if (row == -1) {
	    	  JOptionPane.showMessageDialog(null, "������ �����Ͱ� �����ϴ�.", "������ ����.", JOptionPane.WARNING_MESSAGE);
	    	  return;
	      }
		try {
			String name = text1.getText();
			String age = text2.getText();
			jdbcManager.updateTable(name,age);
			  JOptionPane.showMessageDialog(null, "�����Ͱ� ���� �Ǿ����ϴ�.", "������ ����.", JOptionPane.WARNING_MESSAGE);
	      } catch (Exception ex) {
	         ex.getMessage();
	      }
		
	}

}
