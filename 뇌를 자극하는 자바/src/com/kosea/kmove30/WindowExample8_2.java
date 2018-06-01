package com.kosea.kmove30;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WindowExample8_2{
	
	
	public WindowExample8_2() {
		// DB���� Class(����,��ȸ,����,�߰�);
		JDBC_Manager jdbcManager = new JDBC_Manager();
		JFrame frame = new JFrame("������ ��� ���α׷�");
		frame.setPreferredSize(new Dimension(700, 200));
		frame.setLocation(700, 400);
		Container contentPane = frame.getContentPane();
		String colNames[] = { "�̸�", "����", "����" };
		String genders[]= {"����","��","��"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(2);
		JComboBox<String> genderCombox = new JComboBox<String>(genders);
		//JTextField text3 = new JTextField(1);

		JButton insertBtn = new JButton("�߰�");
		JButton deleteBtn = new JButton("����");
		JButton updateBtn = new JButton("����");
		JButton selectBtn = new JButton("��ȸ");
		panel.add(new JLabel("�̸�"));
		panel.add(text1);
		panel.add(new JLabel("����"));
		panel.add(text2);
		panel.add(new JLabel("����"));
		panel.add(genderCombox);
		panel.add(selectBtn);
		panel.add(updateBtn);
		panel.add(insertBtn);
		panel.add(deleteBtn);

		contentPane.add(panel, BorderLayout.SOUTH);
		// ��ȸ ��ư �̺�Ʈ ������ ���
		table.addMouseListener(new MyMouseListener(text1, text2, genderCombox));
		selectBtn.addActionListener(new SelectActionListener(jdbcManager, table));
		insertBtn.addActionListener(new AddActionListener(jdbcManager, table, text1, text2, genderCombox));
		updateBtn.addActionListener(new UpdateActionListener(table, jdbcManager, text1, text2));
		deleteBtn.addActionListener(new RemoveActionListener(jdbcManager, table));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		System.out.println("���α׷� ����");

		try {
			jdbcManager.DBConnection("com.mysql.jdbc.Driver",
					"jdbc:mysql://localhost:3306/malldb?useUnicode=true&characterEncoding=utf8", "root", "12345");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			frame.setTitle("������ ��� ���α׷�: DB���� ����");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			frame.setTitle("������ ��� ���α׷�: DB���� ����");
		}

		
	}
	
	//public static void main(String[] args) {
		

	//}
}
