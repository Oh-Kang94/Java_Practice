package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Culc;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
	int Mode = 0;

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JRadioButton rbAll;
	private JRadioButton rbEven;
	private JRadioButton rbOdd;
	private JButton btnCulc;
	private JLabel lblNewLabel_1_1;
	private JTextField tfResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setTitle("합계구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum1());
		contentPane.add(getTfNum2());
		contentPane.add(getRbAll());
		contentPane.add(getRbEven());
		contentPane.add(getRbOdd());
		contentPane.add(getBtnCulc());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTfResult());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setBounds(34, 36, 61, 16);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setBounds(34, 99, 61, 16);
		}
		return lblNewLabel_1;
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
				
				}
			});
			tfNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			tfNum1.setBounds(97, 31, 130, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}

	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setColumns(10);
			tfNum2.setBounds(97, 94, 130, 26);
		}
		return tfNum2;
	}

	private JRadioButton getRbAll() {
		if (rbAll == null) {
			rbAll = new JRadioButton("전체");
			rbAll.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			buttonGroup.add(rbAll);
			rbAll.setBounds(239, 32, 72, 23);
		}
		return rbAll;
	}

	private JRadioButton getRbEven() {
		if (rbEven == null) {
			rbEven = new JRadioButton("짝수");
			rbEven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			buttonGroup.add(rbEven);
			rbEven.setBounds(339, 32, 72, 23);
		}
		return rbEven;
	}

	private JRadioButton getRbOdd() {
		if (rbOdd == null) {
			rbOdd = new JRadioButton("홀수");
			rbOdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			buttonGroup.add(rbOdd);
			rbOdd.setBounds(474, 32, 72, 23);
		}
		return rbOdd;
	}

	private JButton getBtnCulc() {
		if (btnCulc == null) {
			btnCulc = new JButton("계산하기");
			btnCulc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Boolean check = checkField();
					if(check) {
						culcAction();
					}else {
						JOptionPane.showMessageDialog(null,"숫자를 입력하세요.","경고",JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
			btnCulc.setBounds(239, 94, 117, 29);
		}
		return btnCulc;
	}

	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("합계");
			lblNewLabel_1_1.setBounds(34, 175, 61, 16);
		}
		return lblNewLabel_1_1;
	}

	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(97, 170, 130, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}

	// function
	private Boolean checkField() {
		boolean check;
		if(tfNum1.getText().equals("") || tfNum2.getText().equals("")) {
			check = false;
		}else {
			check = true;
		}
		return check;
	}
	
	private void culcAction() {
		int Num1 = Integer.parseInt(tfNum1.getText());
		int Num2 = Integer.parseInt(tfNum2.getText());
		Culc culc = new Culc(Num1,Num2);
		
		if (rbAll.isSelected()) {
			tfResult.setText(Integer.toString(culc.all())); 
		}
		if (rbEven.isSelected()) {
			tfResult.setText(Integer.toString(culc.even())); 
		}
		if (rbOdd.isSelected()) {
			tfResult.setText(Integer.toString(culc.odd())); 
		}

	}
	
	// 클래스 불러오는 방법.
//	Culc culc;
//	culc = new Culc();
//  이런식으로도 다른 클래스를 불러올수있음.
}
