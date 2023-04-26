package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Main extends JFrame {

	private JPanel contentPane;
	private JButton btnRegister;
	public static JLabel lbResult;

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
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnRegister());
		contentPane.add(getLbResult());
	}

	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("사용자 등록");
			btnRegister.setBounds(159, 98, 117, 29);
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					register();
				}
			});
		}
		return btnRegister;
	}
	private JLabel getLbResult() {
		if (lbResult == null) {
			lbResult = new JLabel("");
			lbResult.setBounds(61, 192, 288, 16);
		}
		return lbResult;
	}
	// function
	private void register() {
		Register register = new Register();
		register.setVisible(true);
		dispose();
	}
	/*
	private void checkStatus() {
		if(!Temp.tempID.equals("")) {
		lbResult.setText(Temp.tempId+"/"+Temp.tempPD+"/"+tempName)
		Temp.tempID= "";	
		}
		Temp.tempPD.equals("");
		Temp.tempName.equals("");
		
	}*/
}
