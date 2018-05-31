package com.kosea.kmove30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener {
	JTable table;
	JTextField text1,text2,text3;
	JDBC_Manager jdbcManager;
	JComboBox<String> genderCombox;
	
	public AddActionListener(JDBC_Manager jdbcManager,JTable table, JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.jdbcManager = jdbcManager;
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		
	}
	public AddActionListener(JDBC_Manager jdbcManager,JTable table, JTextField text1, JTextField text2,JComboBox<String> genderCombox) {
		super();
		this.jdbcManager = jdbcManager;
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.genderCombox = genderCombox;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean isCheck = false; //�Է�â üũ
		String arr[] = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = genderCombox.getSelectedItem().toString();
			//int selectedIndex = genderCombox.getSelectedIndex();
	        //Object item = genderCombox.getSelectedItem();
	        //System.out.println("selectedIndex"+selectedIndex);
	        //System.out.println("item"+ item);
		 	//genderCombox.setText(table.getValueAt(row, 2).toString()); 
		if(arr[2].equals("����")){
			JOptionPane.showMessageDialog(null, "�߸� �����Ͽ����ϴ�..", "������ ����.", JOptionPane.WARNING_MESSAGE);
			return;//����
		}
		/*if(genderCombox.getSelectedItem()=="��"||genderCombox.getSelectedItem()=="��") {
		arr[2] = genderCombox.getSelectedItem().toString();
		}else {
			 JOptionPane.showMessageDialog(null, "�߸� �����Ͽ����ϴ�..", "������ ����.", JOptionPane.WARNING_MESSAGE);
		}*/
		//arr[2] = text3.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		if(arr[i].length() > 0) {
			isCheck = true;
		}else {
			isCheck = false;
			int row = table.getSelectedRow();
			if (row == -1) {
		    	  JOptionPane.showMessageDialog(null, "�߰��� �����Ͱ� �����ϴ�.", "������ ����.", JOptionPane.WARNING_MESSAGE);
		    	  return;
		      }
		}
		}
		if(isCheck) {
		 model.addRow(arr);
		 
		 try {
			jdbcManager.insertTable(arr);
			 JOptionPane.showMessageDialog(null, "�����Ͱ� �߰� �Ǿ����ϴ�..", "������ �߰�.", JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.getMessage();
		}
		}
		text1.setText("");
		text2.setText("");
		genderCombox.setSelectedIndex(0);
	}

}
