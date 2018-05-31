package com.kosea.kmove30;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MyMouseListener extends MouseAdapter {
	
	JTextField text1,text2,text3;
	JComboBox<String> genderCombox;
	
	public MyMouseListener(JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}


	public MyMouseListener(JTextField text1, JTextField text2, JComboBox<String> genderCombox) {
		super();
		this.text1 = text1;
		this.text2 = text2;
		this.genderCombox = genderCombox;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// ���콺Ŭ���̺�Ʈ�߻���
	     if(e.getButton() == 1){ // ��Ŭ����
	      JTable table = (JTable)e.getSource();
	      int row = table.getSelectedRow(); // ���õǾ��� row���ϱ�
	      if(row != -1 ){ // ���� ���õǾ��� �����ΰ��
	       System.out.println(row);
	       System.out.println(table.getValueAt(row, 0));
	       text1.setText(table.getValueAt(row, 0).toString()); 
	       text2.setText(table.getValueAt(row, 1).toString()); 
	       String genderStr = table.getValueAt(row, 2).toString();
	       if(genderStr.equals("��")) {
	    	   //�޺��ڽ� "��" �� ����
	    	   genderCombox.setSelectedIndex(1);
	       }else if(genderStr.equals("��")) {
	    	   //�޺��ڽ� "��" �� ����
	    	   genderCombox.setSelectedIndex(2);
	       }else {
	    	   //�޺��ڽ� "����"�� ����
	    	   genderCombox.setSelectedIndex(0);
	       }
	       
	   
	       
	      }
	     }   
	    }
}
