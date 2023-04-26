package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfHeight;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JTextField tfWeight;
	private JButton btnCalc;
	private JLabel lblResult;

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
		setTitle("BMI 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfHeight());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1());
		contentPane.add(getTfWeight());
		contentPane.add(getBtnCalc());
		contentPane.add(getLblResult());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("키(신장) : ");
			lblNewLabel.setBounds(67, 61, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("몸무게:");
			lblNewLabel_1.setBounds(67, 137, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfHeight() {
		if (tfHeight == null) {
			tfHeight = new JTextField();
			tfHeight.setBounds(140, 61, 130, 26);
			tfHeight.setColumns(10);
		}
		return tfHeight;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("CM");
			lblNewLabel_2.setBounds(294, 66, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Kg");
			lblNewLabel_2_1.setBounds(294, 142, 61, 16);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getTfWeight() {
		if (tfWeight == null) {
			tfWeight = new JTextField();
			tfWeight.setColumns(10);
			tfWeight.setBounds(140, 132, 130, 26);
		}
		return tfWeight;
	}
	private JButton getBtnCalc() {
		if (btnCalc == null) {
			btnCalc = new JButton("계산하기");
			btnCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
				}
			});
			btnCalc.setBounds(136, 182, 117, 29);
		}
		return btnCalc;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setBounds(67, 260, 343, 38);
		}
		return lblResult;
	}
	
	// function
	private void calc() {
		Calc calc = new Calc(Integer.parseInt(tfHeight.getText()),Integer.parseInt(tfWeight.getText()));
		lblResult.setText("귀하의 bmi지수는 "+String.format("%.2f",calc.intbmi())+"이고,"+calc.strbmi()+"입니다.");
		
	}
	
}
