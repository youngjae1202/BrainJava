package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SearchActionListener implements ActionListener {
	public SearchActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	JTable table;
	JTextField text1,text2,text3;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		if (row == -1)
			return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);
	
	}

}
