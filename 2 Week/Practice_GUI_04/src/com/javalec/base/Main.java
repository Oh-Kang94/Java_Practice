package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import com.javalec.function.Sum;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfNum;
	private JButton btnOk;
	private JLabel lbResult;
	private JTextField tfResult;

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
		setTitle("Sum of digits");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfNum());
		contentPane.add(getBtnOk());
		contentPane.add(getLbResult());
		contentPane.add(getTfResult());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("단단위 입력 숫자 (0~9)");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(36, 35, 167, 16);
		}
		return lblNewLabel;
	}

	private JTextField getTfNum() {
		if (tfNum == null) {
			tfNum = new JTextField();
			tfNum.setBounds(241, 30, 130, 26);
			tfNum.setColumns(10);
		}
		return tfNum;
	}

	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainSum();
				}
			});
			btnOk.setBounds(372, 30, 117, 29);
		}
		return btnOk;
	}

	private JLabel getLbResult() {
		if (lbResult == null) {
			lbResult = new JLabel("입력하신 숫자의 단단위 합은           입니다");
			lbResult.setHorizontalAlignment(SwingConstants.CENTER);
			lbResult.setBounds(94, 110, 330, 16);
		}
		return lbResult;
	}

	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setBounds(295, 105, 41, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}

	// function

	private void mainSum() {
		int num = Integer.parseInt(tfNum.getText());
		String result;
		Sum sum = new Sum(num);

		result = Integer.toString(sum.sum1());

		tfResult.setText(result);

	}
}
