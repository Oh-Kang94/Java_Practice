package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class Main extends JFrame {

	private JPanel contentPane;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbApple;
	private JCheckBox cbBanana;
	private JButton btnFruit;
	private JTextField tfFruit;

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
		setTitle("CheckBox / Radio Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getRbKBS());
		contentPane.add(getRbMBC());
		contentPane.add(getBtnBroad());
		contentPane.add(getTfBroad());
		contentPane.add(getCbApple());
		contentPane.add(getCbBanana());
		contentPane.add(getBtnFruit());
		contentPane.add(getTfFruit());
	}

	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setBounds(257, 40, 141, 23);
		}
		return rbKBS;
	}

	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(257, 75, 141, 23);
		}
		return rbMBC;
	}

	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(257, 122, 117, 29);
		}
		return btnBroad;
	}

	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(257, 168, 130, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}

	private JCheckBox getCbApple() {
		if (cbApple == null) {
			cbApple = new JCheckBox("Apple");
			cbApple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			cbApple.setBounds(55, 40, 128, 23);
		}
		return cbApple;
	}

	private JCheckBox getCbBanana() {
		if (cbBanana == null) {
			cbBanana = new JCheckBox("Banana");
			cbBanana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			cbBanana.setBounds(55, 85, 128, 23);
		}
		return cbBanana;
	}

	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			btnFruit.setBounds(55, 122, 117, 29);
		}
		return btnFruit;
	}

	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(55, 168, 130, 26);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	// function

	private void broadCheck() {
		if (rbKBS.isSelected()) {
			tfBroad.setText("KBS is selected");
		}
		if (rbMBC.isSelected()) {
			tfBroad.setText("MBC is selected");
		}

	}

	private void fruitCheck() {
		// 흐름을 생각하면서 코딩을 해야한다.
		tfFruit.setText("Nothing");
		
		if (cbApple.isSelected()) {
			tfFruit.setText("Apple");
		}
		if (cbBanana.isSelected()) {
			tfFruit.setText("Banana");
		}
		if (cbApple.isSelected() && cbBanana.isSelected()) {
			tfFruit.setText("Apple & Banana");
		}

	}

}
