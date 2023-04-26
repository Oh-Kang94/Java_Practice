package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JButton btnAddition;
	private JLabel lblNewLabel_1;
	private JTextField tfNum2;
	private JButton btnSubtraction;
	private JLabel lblNewLabel_2;
	private JTextField tfResult;
	Calc calc = new Calc();

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
		setTitle("덧셈과 뺄셈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfNum1());
		contentPane.add(getBtnAddition());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum2());
		contentPane.add(getBtnSubtraction());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfResult());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자 1:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(60, 54, 61, 16);
		}
		return lblNewLabel;
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.RIGHT);
			tfNum1.setBounds(140, 49, 130, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}

	private JButton getBtnAddition() {
		if (btnAddition == null) {
			btnAddition = new JButton("Addition");
			btnAddition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("add");
					
				}
			});
			btnAddition.setBounds(278, 48, 117, 29);
		}
		return btnAddition;
	}

	private JButton getBtnSubtraction() {
		if (btnSubtraction == null) {
			btnSubtraction = new JButton("Subtraction");
			btnSubtraction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("sub");
				}
			});
			btnSubtraction.setBounds(278, 90, 117, 29);
		}
		return btnSubtraction;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자 2:");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setBounds(60, 95, 61, 16);
		}
		return lblNewLabel_1;
	}

	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.RIGHT);
			tfNum2.setBounds(140, 90, 130, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("결과 :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setBounds(60, 141, 61, 16);
		}
		return lblNewLabel_2;
	}

	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.RIGHT);
			tfResult.setBounds(140, 136, 255, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	// Function

	private void calc(String part) {
		int num1 = Integer.parseInt(tfNum1.getText());
		int num2 = Integer.parseInt(tfNum2.getText());
		String result ="";
		Calc calc = new Calc(num1, num2);

		if (part.equals("add")) {
			result = Integer.toString(calc.add());
		} else {
			result = Integer.toString(calc.sub());
		}

		tfResult.setText(result);
	}

	// End
}
