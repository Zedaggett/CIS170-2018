package orderPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class OrderFinalDetails {

	private JFrame frame;
	private JPasswordField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderFinalDetails window = new OrderFinalDetails();
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
	public OrderFinalDetails() {
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
		
		JTextArea txtrOrderDetails = new JTextArea();
		txtrOrderDetails.setEditable(false);
		txtrOrderDetails.setText("Order details:");
		txtrOrderDetails.setBounds(72, 13, 285, 22);
		frame.getContentPane().add(txtrOrderDetails);
		
		JLabel lblItem = new JLabel("Item:");
		lblItem.setBounds(31, 48, 56, 16);
		frame.getContentPane().add(lblItem);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(31, 77, 56, 16);
		frame.getContentPane().add(lblQuantity);
		
		JLabel lblShippingAddress = new JLabel("Shipping Address:");
		lblShippingAddress.setBounds(31, 110, 104, 16);
		frame.getContentPane().add(lblShippingAddress);
		
		JLabel lblOrderTotal = new JLabel("Order Total:");
		lblOrderTotal.setBounds(31, 168, 104, 16);
		frame.getContentPane().add(lblOrderTotal);
		
		JLabel lblShippingTotal = new JLabel("Shipping Total:");
		lblShippingTotal.setBounds(31, 139, 104, 16);
		frame.getContentPane().add(lblShippingTotal);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(118, 48, 96, 22);
		frame.getContentPane().add(textArea);
		
		JTextArea txtrReEnterPassword = new JTextArea();
		txtrReEnterPassword.setEditable(false);
		txtrReEnterPassword.setText("Confirm Password:");
		txtrReEnterPassword.setBounds(31, 186, 165, 22);
		frame.getContentPane().add(txtrReEnterPassword);
		
		textField = new JPasswordField();
		textField.setBounds(41, 218, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrConfirmAddress = new JTextArea();
		txtrConfirmAddress.setEditable(false);
		txtrConfirmAddress.setText("Confirm Address:");
		txtrConfirmAddress.setBounds(225, 186, 132, 22);
		frame.getContentPane().add(txtrConfirmAddress);
		
		textField_1 = new JTextField();
		textField_1.setBounds(235, 218, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCompleteOrder = new JButton("Complete Order");
		btnCompleteOrder.setBounds(262, 106, 144, 25);
		frame.getContentPane().add(btnCompleteOrder);
	}

}
