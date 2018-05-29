package chap19;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ContactInfoFinder {

	public static void main(String[] args) {
		JFrame frame= new JFrame("연락처 검색 프로그램");
		frame.setPreferredSize(new Dimension(500, 400));
		frame.setLocation(500, 200);
		Container contentPane = frame.getContentPane();
		String colNames[] = {"이름","나이","성별"};
		JTable table = new JTable();
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(10);
		JTextField text3 = new JTextField(5);
		JButton button = new JButton("검색");
		
		
		button.addActionListener(new SearchActionListener(table,text1,text2,text3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
