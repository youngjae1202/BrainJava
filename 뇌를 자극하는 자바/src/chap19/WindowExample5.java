package chap19;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample5 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Cafe Program");
		frame.setLocation(500, 400);
		Color color = new Color(100, 100, 100);
		frame.getContentPane().setBackground(color);
		Container contentPane = frame.getContentPane();
		BoxLayout layout= new BoxLayout(contentPane, BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		contentPane.add(new JButton("�ڹ�"));
		contentPane.add(new JButton("����������"));
		contentPane.add(new JButton("īǪġ��"));
		contentPane.add(new JButton("�Ƹ޸�ī��"));
		contentPane.add(new JButton("ī���"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
