package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfId;
	private JLabel lblNewLabel_1;
	private JTextField tfRdomain;
	private JComboBox cbDomain;
	private JLabel lblNewLabel_2;
	private JTextField tfResult;
	private JLabel lblNewLabel_3;

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
		setTitle("전자우편 주소 결정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfId());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfRdomain());
		contentPane.add(getCbDomain());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfResult());
		contentPane.add(getLblNewLabel_3());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Emain주소:");
			lblNewLabel.setBounds(33, 92, 88, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setBounds(104, 87, 130, 26);
			tfId.setColumns(10);
		}
		return tfId;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("@");
			lblNewLabel_1.setBounds(236, 92, 16, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfRdomain() {
		if (tfRdomain == null) {
			tfRdomain = new JTextField();
			tfRdomain.setEditable(false);
			tfRdomain.setBounds(246, 87, 130, 26);
			tfRdomain.setColumns(10);
		}
		return tfRdomain;
	}
	private JComboBox getCbDomain() {
		if (cbDomain == null) {
			cbDomain = new JComboBox();
			cbDomain.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "daum.net", "gmail.net", "icloud.com"}));
			cbDomain.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					completeAction();
				}
			});
			cbDomain.setBounds(388, 88, 160, 26);
		}
		return cbDomain;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("당신의 이메일 주소는");
			lblNewLabel_2.setBounds(79, 150, 155, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(198, 145, 232, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("입니다.");
			lblNewLabel_3.setBounds(442, 150, 61, 16);
		}
		return lblNewLabel_3;
	}
	private void completeAction(){
		String strDomain = cbDomain.getSelectedItem().toString();
		tfRdomain.setText(strDomain);
		tfResult.setText(tfId.getText()+"@"+tfRdomain.getText());
		
	}
}
