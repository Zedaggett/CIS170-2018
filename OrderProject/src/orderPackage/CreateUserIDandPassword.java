package orderPackage;
import orderPackage.User;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CreateUserIDandPassword {

	User u = new User();
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
		textField.equals(u.getID());
				
		textField_1 = new JTextField();
		textField_1.setBounds(217, 149, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1 = u.getPassword();
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					DefineUser window = new DefineUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnSubmit.setBounds(323, 215, 97, 25);
		frame.getContentPane().add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 184, 116, 22);
		frame.getContentPane().add(passwordField);
		passwordField = (JPasswordField) u.password;
		
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
