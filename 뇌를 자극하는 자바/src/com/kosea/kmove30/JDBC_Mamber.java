package com.kosea.kmove30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JDBC_Mamber extends JFrame {
	private WindowProject main;
	private TestFrm testFrm;

	private JButton btnLogin;
	private JButton btnInit;
	private JPasswordField passText;
	private JTextField userText;
	private boolean bLoginCheck;
	ResultSet rs = null;
	public static void main(String[] args) {
		// new LoginView();
	}

	public JDBC_Mamber() {

		// setting
		setTitle("login");
		setSize(280, 150);
		setResizable(false);
		setLocation(800, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		placeLoginPanel(panel);

		add(panel);

		setVisible(true);
	}

	public void placeLoginPanel(JPanel panel) {
		panel.setLayout(null);
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JLabel passLabel = new JLabel("Pass");
		passLabel.setBounds(10, 40, 80, 25);
		panel.add(passLabel);

		userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		passText = new JPasswordField(20);
		passText.setBounds(100, 40, 160, 25);
		panel.add(passText);
		passText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//isLoginCheck();
			}
		});

		btnInit = new JButton("Reset");
		btnInit.setBounds(10, 80, 100, 25);
		panel.add(btnInit);
		btnInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userText.setText("");
				passText.setText("");
			}
		});

		btnLogin = new JButton("Login");
		btnLogin.setBounds(160, 80, 100, 25);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck(userText.getText(),new String(passText.getPassword()));
			}
		});
	}

	public void isLoginCheck(String dpi, String dpw) {
		String idChkquery = "select dpi,dpw from member where dpi = '"+dpi+"'";
		JDBC_Manager jdbcManager = new JDBC_Manager();
		try {
			jdbcManager.DBConnection("com.mysql.jdbc.Driver",
					"jdbc:mysql://localhost:3306/malldb?useUnicode=true&characterEncoding=utf8", "root", "12345");
			rs = jdbcManager.selectTable(idChkquery);
			if(rs.next()) {
				//아이디 존재하면 패스워드 비교
				
				if(dpw.equals(rs.getString("dpw"))) {
					JOptionPane.showMessageDialog(null, "로그인이 되었습니다.");
					bLoginCheck =true;
					
					if(isLogin())
						main.showFrameTest();
				}else {
					//패스워드 실패
					JOptionPane.showMessageDialog(null, "패스워드가 틀렸습니다.");
				}
			}else {
				JOptionPane.showMessageDialog(null, "아이디가 틀렸습니다.");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// mainProcess와 연동
	public void setMain(WindowProject main) {
		this.main = main;
	}

	public boolean isLogin() {
		return bLoginCheck;
	}

}
