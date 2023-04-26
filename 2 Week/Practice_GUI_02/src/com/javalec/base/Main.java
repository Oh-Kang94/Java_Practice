package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField tfrNum1;
	private JTextField tfrNum2;
	private JTextField tfResult;
	private JLabel lblNewLabel_3;
	String part = "";
	private JTextField tfMenu;

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
		setTitle("두개의 숫자 가감승제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 237, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum1());
		contentPane.add(getTfNum2());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getTfrNum1());
		contentPane.add(getTfrNum2());
		contentPane.add(getTfMenu());
		contentPane.add(getTfResult());
		contentPane.add(getLblNewLabel_3());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자1:");
			lblNewLabel.setBounds(39, 39, 61, 16);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자2:");
			lblNewLabel_1.setBounds(39, 98, 61, 16);
		}
		return lblNewLabel_1;
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TextField에 숫자외의 문자가 입력되면 지우기
					if(e.getKeyChar()>='0'&& e.getKeyChar()<='9') {	
					}else {
						JOptionPane.showMessageDialog(null, "숫자만 입력하세요","경고",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			tfNum1.setBounds(81, 34, 130, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}

	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(81, 93, 130, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("+");
			btnNewButton.setForeground(new Color(255, 38, 0));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("add");
				}
			});
			btnNewButton.setBounds(223, 34, 117, 29);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("-");
			btnNewButton_1.setForeground(new Color(255, 38, 0));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("sub");
				}
			});
			btnNewButton_1.setBounds(333, 34, 117, 29);
		}
		return btnNewButton_1;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("X");
			btnNewButton_2.setForeground(new Color(4, 50, 255));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("mul");
					
				}
			});
			btnNewButton_2.setBounds(223, 93, 117, 29);
		}
		return btnNewButton_2;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("/");
			btnNewButton_3.setForeground(new Color(4, 50, 255));
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("div");
				}
			});
			btnNewButton_3.setBounds(333, 93, 117, 29);
		}
		return btnNewButton_3;
	}

	private JTextField getTfrNum1() {
		if (tfrNum1 == null) {
			tfrNum1 = new JTextField();
			tfrNum1.setEditable(false);
			tfrNum1.setBounds(53, 172, 108, 26);
			tfrNum1.setColumns(10);
		}
		return tfrNum1;
	}

	private JTextField getTfrNum2() {
		if (tfrNum2 == null) {
			tfrNum2 = new JTextField();
			tfrNum2.setEditable(false);
			tfrNum2.setBounds(223, 172, 81, 26);
			tfrNum2.setColumns(10);
		}
		return tfrNum2;
	}

	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(348, 172, 96, 26);
			tfResult.setColumns(10);

		}
		return tfResult;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("=");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(303, 177, 41, 16);
		}
		return lblNewLabel_3;
	}

	private JTextField getTfMenu() {
		if (tfMenu == null) {
			tfMenu = new JTextField();
			tfMenu.setEditable(false);
			tfMenu.setBounds(170, 172, 41, 26);
			tfMenu.setColumns(10);
		}
		return tfMenu;
	}
	/// function

	private void calc(String part) {
		String num1 = tfNum1.getText();
		String num2 = tfNum2.getText();
		Calc calc = new Calc(num1, num2);
		String result = "";

		tfrNum1.setText(tfNum1.getText());
		tfrNum2.setText(tfNum2.getText());
		
		switch (part) {
		case "add":
			tfMenu.setText("+");
			result = calc.add();
			break;
		case "sub":
			tfMenu.setText("-");
			result = calc.sub();
			break;
		case "mul":
			tfMenu.setText("X");
			result = calc.mul();
			break;
		case "div":
			tfMenu.setText("/");
			result = String.format("%.4s", calc.div());
			break;
		default:
			break;
		}
		tfResult.setText(result);

	}

}
