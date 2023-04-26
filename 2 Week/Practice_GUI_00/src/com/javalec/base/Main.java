package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	private int count = 0; // 환영 횟수
	private JTextField tfName;
	private JLabel IbINewLabel_1;

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
		setTitle("GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 108, 104));
		contentPane.setForeground(new Color(255, 108, 104));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel());
		contentPane.add(getIbINewLabel_1());
		contentPane.add(getTfName());
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayHello();
				}
			});
			btnNewButton.setBounds(145, 157, 117, 29);
		}
		return btnNewButton;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Java Swing Button Text");
			lblNewLabel.setBounds(132, 91, 191, 16);
		}
		return lblNewLabel;
	}
// End

//--functions
	private void displayHello() {
		String name = tfName.getText();
		String str = "환영합니다.:";
		count++;
		JOptionPane.showMessageDialog(null, name + "님!\n " + str + count);
	}

	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(145, 119, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}

	private JLabel getIbINewLabel_1() {
		if (IbINewLabel_1 == null) {
			IbINewLabel_1 = new JLabel("이름 :");
			IbINewLabel_1.setBounds(74, 124, 61, 16);
		}
		return IbINewLabel_1;
	}

}
