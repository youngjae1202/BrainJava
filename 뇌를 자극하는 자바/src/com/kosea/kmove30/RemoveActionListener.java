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
      int confirm = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?","삭제", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
      System.out.println("confirm" + confirm);
      if(confirm == 1)
    	  return;
	  int row = table.getSelectedRow();
      if (row == -1) {
    	  JOptionPane.showMessageDialog(null, "삭제할 데이터가 없습니다.", "데이터가 없습니다.", JOptionPane.WARNING_MESSAGE);
    	  return;
      }
      DefaultTableModel model = (DefaultTableModel) table.getModel();
      ////삭제할 이름
      Object name = table.getValueAt(row, 0);// Object는 모든걸 포함하기 때문이다.String은 하나의 타입이기때문이다.
      String deleteName = name.toString();
      System.out.println(deleteName);
      
      model.removeRow(row);
      
      //DB 테이블 레코드(데이터) 삭제
      try {
         jdbcManager.deleteTable(deleteName);
         JOptionPane.showMessageDialog(null, "데이터가 삭제되었습니다", "데이터 삭제", JOptionPane.WARNING_MESSAGE);
      } catch (Exception ex) {
         ex.getMessage();
      }
      }
   }

