package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JComboBox cbFruit;
	private JTextField tfFruit;
	private JTextField tfAppend;
	private JButton btnAppend;

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
		setTitle("Combo box");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCbFruit());
		contentPane.add(getTfFruit());
		contentPane.add(getTfAppend());
		contentPane.add(getBtnAppend());
	}

	private JComboBox getCbFruit() {
		if (cbFruit == null) {
			cbFruit = new JComboBox();
			cbFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboAction();
				}
			});
			cbFruit.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana"}));
			cbFruit.setBounds(44, 16, 135, 44);
		}
		return cbFruit;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(227, 24, 130, 26);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	private JTextField getTfAppend() {
		if (tfAppend == null) {
			tfAppend = new JTextField();
			tfAppend.setBounds(44, 90, 130, 26);
			tfAppend.setColumns(10);
		}
		return tfAppend;
	}
	private JButton getBtnAppend() {
		if (btnAppend == null) {
			btnAppend = new JButton("Add");
			btnAppend.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					appendAction();
				}
			});
			btnAppend.setBounds(237, 90, 117, 29);
		}
		return btnAppend;
	}

	// function
	private void comboAction(){
		String strFruit = cbFruit.getSelectedItem().toString();
		tfFruit.setText(strFruit);
		
	}

	private void appendAction(){
		String str = tfAppend.getText();
		cbFruit.addItem(str);
	}
}
