package app.sri;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CuurnCOnv {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuurnCOnv window = new CuurnCOnv();
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
	public CuurnCOnv() {
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
		
		textField = new JTextField();
		textField.setBounds(304, 78, 354, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(38, 57, 720, 11);
		frame.getContentPane().add(progressBar);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Adobe Heiti Std R", Font.PLAIN, 23));
		lblNewLabel.setBounds(260, 10, 249, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INR ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(172, 53, 172, 89);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("USD");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(172, 163, 172, 89);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(304, 188, 354, 49);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int inr=Integer.parseInt(textField.getText());
				float ans=0;
				float usd= 0.013f;
			    ans =inr*usd;
				textField_1.setText(String.valueOf(ans));
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton.setBounds(286, 310, 223, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);			}
		});
		btnNewButton_1.setBounds(10, 397, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
}
