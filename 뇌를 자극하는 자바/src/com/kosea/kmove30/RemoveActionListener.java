package com.kosea.kmove30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener {
   JTable table;
   JDBC_Manager jdbcManager;

   public RemoveActionListener(JDBC_Manager jdbcManager,JTable table) {
      super();
      this.jdbcManager = jdbcManager;
      this.table = table;
      
   }


   @Override
   public void actionPerformed(ActionEvent e) {
      int confirm = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?","����", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
      System.out.println("confirm" + confirm);
      if(confirm == 1)
    	  return;
	  int row = table.getSelectedRow();
      if (row == -1) {
    	  JOptionPane.showMessageDialog(null, "������ �����Ͱ� �����ϴ�.", "�����Ͱ� �����ϴ�.", JOptionPane.WARNING_MESSAGE);
    	  return;
      }
      DefaultTableModel model = (DefaultTableModel) table.getModel();
      ////������ �̸�
      Object name = table.getValueAt(row, 0);// Object�� ���� �����ϱ� �����̴�.String�� �ϳ��� Ÿ���̱⶧���̴�.
      String deleteName = name.toString();
      System.out.println(deleteName);
      
      model.removeRow(row);
      
      //DB ���̺� ���ڵ�(������) ����
      try {
         jdbcManager.deleteTable(deleteName);
         JOptionPane.showMessageDialog(null, "�����Ͱ� �����Ǿ����ϴ�", "������ ����", JOptionPane.WARNING_MESSAGE);
      } catch (Exception ex) {
         ex.getMessage();
      }
      }
   }

