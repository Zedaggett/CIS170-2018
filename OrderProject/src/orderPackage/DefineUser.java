package orderPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DefineUser {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefineUser window = new DefineUser();
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
	public DefineUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrInOrderTo = new JTextArea();
		txtrInOrderTo.setEditable(false);
		txtrInOrderTo.setLineWrap(true);
		txtrInOrderTo.setText("In order to place an order, Users must first provide the following:");
		txtrInOrderTo.setBounds(0, 13, 432, 84);
		frame.getContentPane().add(txtrInOrderTo);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(59, 125, 99, 16);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(59, 154, 74, 16);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setBounds(59, 183, 99, 16);
		frame.getContentPane().add(lblEmailAddress);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(59, 212, 56, 16);
		frame.getContentPane().add(lblAddress);
		
		textField = new JTextField();
		textField.setBounds(182, 177, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 209, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 151, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(182, 122, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 228, 97, 25);
		frame.getContentPane().add(btnNext);
	}

}
