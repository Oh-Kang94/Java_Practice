package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JComboBox cbCalc;
	private JTextField tfNum2;
	private JButton btnAction;
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
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTfNum1());
		contentPane.add(getCbCalc());
		contentPane.add(getTfNum2());
		contentPane.add(getBtnAction());
		contentPane.add(getTfResult());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(19, 106, 75, 38);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}

	private JComboBox getCbCalc() {
		if (cbCalc == null) {
			cbCalc = new JComboBox();
			cbCalc.setModel(new DefaultComboBoxModel(new String[] { "+", "-", "*", "/" }));
			cbCalc.setBounds(114, 103, 75, 38);
		}
		return cbCalc;
	}

	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(201, 108, 106, 31);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}

	private JButton getBtnAction() {
		if (btnAction == null) {
			btnAction = new JButton("=");
			btnAction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
				}
			});
			btnAction.setBounds(319, 108, 83, 29);
		}
		return btnAction;
	}

	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setBounds(414, 108, 130, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	// function

	private void calc() {
		int num1 = Integer.parseInt(tfNum1.getText());
		int num2 = Integer.parseInt(tfNum2.getText());
		String strMode = cbCalc.getSelectedItem().toString();
		String result = "";
		Calc calc = new Calc(num1, num2);

		switch (strMode) {
		case "+":
			result = Integer.toString(calc.add());
			tfResult.setText(result);
			break;
		case "-":
			result = Integer.toString(calc.sub());
			tfResult.setText(result);
			break;
		case "*":
			result = Integer.toString(calc.mul());
			tfResult.setText(result);
			break;
		case "/":
			result = String.format("%.2f", calc.div());
			tfResult.setText(result);
			break;
		default:
			break;
		}

	}

}
