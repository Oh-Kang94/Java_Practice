package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JDialog {
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JLabel lblNewLabel_2;
	private JTextField tfId;
	private JTextField tfName;
	private JPasswordField pfPassword;
	private JButton btnConfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register dialog = new Register();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Register() {
		setTitle("사용자 등록 화면");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblPassword());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getTfId());
		getContentPane().add(getTfName());
		getContentPane().add(getPfPassword());
		getContentPane().add(getBtnConfirm());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Uese Id : ");
			lblNewLabel.setBounds(129, 52, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password : ");
			lblPassword.setBounds(114, 91, 89, 16);
		}
		return lblPassword;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Uese Name : ");
			lblNewLabel_2.setBounds(101, 132, 89, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setBounds(202, 47, 130, 26);
			tfId.setColumns(10);
		}
		return tfId;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(202, 127, 130, 26);
		}
		return tfName;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(202, 86, 130, 26);
		}
		return pfPassword;
	}
	private JButton getBtnConfirm() {
		if (btnConfirm == null) {
			btnConfirm = new JButton("OK");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					confirm();
					
				}
			});
			btnConfirm.setBounds(154, 198, 117, 29);
		}
		return btnConfirm;
		
	}
	//function

	
	private void confirm () {
		char[] pass = pfPassword.getPassword();
		Temp.tempID = tfId.getText();
		Temp.tempPD = new String(pass);
		Temp.tempName = tfName.getText();
		Main.lbResult.setText("ID : "+Temp.tempID+"\nPassword : "+ Temp.tempPD+"\nName : "+Temp.tempName); 
		
		Main main = new Main();
		main.setVisible(true);
		
		dispose();
	}
	
}
