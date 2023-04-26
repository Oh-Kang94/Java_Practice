package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Sum;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfNum01;
	private JLabel lblNewLabel_1;
	private JTextField tfNum02;
	private JButton btnSum;
	private JLabel lblNewLabel_2;
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
		setTitle("범위의 숫자 합계 구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum01());
		contentPane.add(getTfNum02());
		contentPane.add(getBtnSum());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfResult());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setBounds(50, 59, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum01() {
		if (tfNum01 == null) {
			tfNum01 = new JTextField();
			tfNum01.setBounds(123, 54, 130, 26);
			tfNum01.setColumns(10);
		}
		return tfNum01;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setBounds(50, 114, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum02() {
		if (tfNum02 == null) {
			tfNum02 = new JTextField();
			tfNum02.setBounds(123, 109, 130, 26);
			tfNum02.setColumns(10);
		}
		return tfNum02;
	}
	private JButton getBtnSum() {
		if (btnSum == null) {
			btnSum = new JButton("합계구하기");
			btnSum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sum();
				}
			});
			btnSum.setBounds(291, 54, 117, 29);
		}
		return btnSum;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("합계");
			lblNewLabel_2.setBounds(265, 114, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(298, 109, 130, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	// function
	
	private void sum() {
		int num1 = Integer.parseInt(tfNum01.getText());
		int num2 = Integer.parseInt(tfNum02.getText());
		String result = "";
		Sum sum = new Sum(num1,num2);
		result = Integer.toString(sum.sum());
		tfResult.setText(result);
		
		
	}
}
