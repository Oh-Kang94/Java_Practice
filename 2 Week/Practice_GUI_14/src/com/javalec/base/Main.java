package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblImage;
	private JButton btnBee;
	private JButton btnFox;
	private JButton btnCat;
	private JButton btnDog;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnFox());
		contentPane.add(getBtnBee());
		contentPane.add(getBtnCat());
		contentPane.add(getBtnDog());
		contentPane.add(getLblImage());
	}

	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setBounds(225, 31, 180, 187);
		}
		return lblImage;
	}
	private JButton getBtnBee() {
		if (btnBee == null) {
			btnBee = new JButton("bee");
			btnBee.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					beeAction();
				}
			});
			btnBee.setBounds(43, 41, 117, 29);
		}
		return btnBee;
	}
	
	private JButton getBtnFox() {
		if (btnFox == null) {
			btnFox = new JButton("fox");
			btnFox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					foxAction();
				}
			});
			btnFox.setBounds(43, 186, 117, 29);
		}
		return btnFox;
	}
	
	private JButton getBtnCat() {
		if (btnCat == null) {
			btnCat = new JButton("cat");
			btnCat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					catAction();
				}
			});
			btnCat.setBounds(43, 82, 117, 29);
		}
		return btnCat;
	}
	private JButton getBtnDog() {
		if (btnDog == null) {
			btnDog = new JButton("dog");
			btnDog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dogAction();
				}
			});
			btnDog.setBounds(43, 138, 117, 29);
		}
		return btnDog;
	}
	// Function
	private void beeAction() {
		lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/bee.png")));
		
	}
	private void dogAction() {
		lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/dog.png")));
		
	}
	private void catAction() {
		lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/cat.png")));
		
	}
	private void foxAction() {
		lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/fox.png")));
		
	}
}
