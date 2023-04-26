package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPasswordField pfPassword;
	private JButton btOk;
	private JTextField tfResult;
	private JLabel lblNewLabel_1;
	private JPasswordField pfCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getPfPassword());
		contentPane.add(getPfCheck());
		contentPane.add(getBtOk());
		contentPane.add(getTfResult());
		contentPane.add(getLblNewLabel_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(64, 74, 61, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(151, 69, 114, 26);
		}
		return pfPassword;
	}
	private JButton getBtOk() {
		if (btOk == null) {
			btOk = new JButton("OK");
			btOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btOk.setBounds(151, 173, 117, 29);
		}
		return btOk;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setBounds(149, 214, 130, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	
	private JPasswordField getPfCheck() {
		if (pfCheck == null) {
			pfCheck = new JPasswordField();
			pfCheck.setBounds(151, 127, 114, 26);
		}
		return pfCheck;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setBounds(64, 132, 61, 16);
		}
		return lblNewLabel_1;
	}
	//function
	private void checkPassword() {
		char[] pass = pfPassword.getPassword();
		char[] pass1 = pfCheck.getPassword();
		String passString = new String(pass);
		String passCheck= new String(pass1);
		if(passString == passCheck) {
			tfResult.setText("일치합니다.");
		}else {
			tfResult.setText("불일치합니다.");
		}
		
	}
	
	//end
	
	
}
