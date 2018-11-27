package orderPackage;
import orderPackage.User;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class CreateUserIDandPassword {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUserIDandPassword window = new CreateUserIDandPassword();
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
	public CreateUserIDandPassword() {
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
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(105, 152, 74, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setBounds(105, 114, 56, 16);
		frame.getContentPane().add(lblUserId);
		
		textField = new JTextField();
		textField.setBounds(217, 111, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.equals(User.getID());
				
		textField_1 = new JTextField();
		textField_1.setBounds(217, 149, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(323, 215, 97, 25);
		frame.getContentPane().add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 184, 116, 22);
		frame.getContentPane().add(passwordField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(77, 187, 116, 16);
		frame.getContentPane().add(lblConfirmPassword);
		
		JTextArea txtrNewUsersMust = new JTextArea();
		txtrNewUsersMust.setEditable(false);
		txtrNewUsersMust.setText("New Users must create an ID and Password:");
		txtrNewUsersMust.setBounds(46, 25, 359, 72);
		frame.getContentPane().add(txtrNewUsersMust);
	}
}
