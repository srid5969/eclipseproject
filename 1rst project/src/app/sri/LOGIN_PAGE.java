package app.sri;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGIN_PAGE {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN_PAGE window = new LOGIN_PAGE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LOGIN_PAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 782, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(284, 32, 185, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME :");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(142, 140, 115, 67);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD :");
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(142, 217, 121, 67);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField.setBounds(341, 155, 185, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				if(username.contains("sridhar") && password.contains("2001")) {
					textField.setText(null);
					passwordField.setText(null);
//					ArraySearching.main(null);
//					CuurnCOnv(main);
					CuurnCOnv.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(0, 255, 64));
		btnNewButton.setFont(new Font("Courier New", Font.BOLD, 24));
		btnNewButton.setBounds(284, 317, 207, 50);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(341, 229, 185, 32);
		frame.getContentPane().add(passwordField);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(0, 255, 64));
		btnExit.setFont(new Font("Courier New", Font.BOLD, 24));
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(26, 317, 207, 50);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setForeground(new Color(0, 255, 64));
		btnReset.setFont(new Font("Courier New", Font.BOLD, 24));
		btnReset.setBackground(Color.BLACK);
		btnReset.setBounds(551, 317, 207, 50);
		frame.getContentPane().add(btnReset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(70, 282, 612, 13);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(70, 100, 612, 13);
		frame.getContentPane().add(separator_1);
	}
}
