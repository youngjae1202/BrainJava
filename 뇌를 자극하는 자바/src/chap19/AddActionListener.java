package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener {
	JTable table;
	JTextField text1,text2,text3;
	public AddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean isCheck = false; //�Է�â üũ
		String arr[] = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		if(arr[i].length() > 0) 
			isCheck = true;
		else
			isCheck = false;
		}
		
		if(isCheck)
		 model.addRow(arr);
		
		text1.setText("");
		text2.setText("");
		text3.setText("");
	}

}
