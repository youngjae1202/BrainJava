package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager;

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
		int row = table.getSelectedRow();
		if (row == 1) {
			return;
		}
		Object name = table.getValueAt(row, 0);// Object�� ���� �����ϱ� �����̴�.String�� �ϳ��� Ÿ���̱⶧���̴�.
		String deleteName = name.toString();
		System.out.println(deleteName);
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);
		
		//DB ���̺� ���ڵ�(������) ����
		try {
			jdbcManager.deleteTable(deleteName);
		} catch (Exception ex) {
			ex.getMessage();
		}

	}

}
