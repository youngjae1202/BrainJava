package chap19;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorExample2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("µ¡¼À ÇÁ·Î±×·¥");
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);
		
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextField text3 = new JTextField(10);
		
		JLabel pl = new JLabel("+");
		JLabel mi = new JLabel("=");
		
		
		JButton okBtn = new JButton("È®ÀÎ");
		JButton cBtn = new JButton("Ãë¼Ò");
		
		okBtn.addActionListener(new Exercise19_3_Listener(text1,text2,text3));
		cBtn.addActionListener(new Exercise19_3_Listener(text1,text2,text3));
		
		contentPane.add(text1);
		contentPane.add(pl);
		contentPane.add(text2);
		contentPane.add(mi);
		contentPane.add(text3);
		contentPane.add(okBtn);
		contentPane.add(cBtn);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
