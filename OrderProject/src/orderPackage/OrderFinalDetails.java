package orderPackage;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFormattedTextField;


public class OrderFinalDetails {

	Order o = new Order();
	User u = new User();

	
	JFrame frame;
	public JPasswordField textField;
	public JTextField textField_1;
	public static OrderFinalDetails Order = new OrderFinalDetails();
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
		btnCompleteOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					OrderFinalDetails window = new OrderFinalDetails();
					window.finalize();
					System.out.println("Thank you for placing your order with us!");
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		}); 
		
	
		
		JLabel lblNewLabel = new JLabel(OrderInfo.userChoice1);
		lblNewLabel.setBounds(151, 48, 159, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(OrderInfo.userChoice2);
		lblNewLabel_1.setBounds(161, 77, 149, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblShpadd = new JLabel(DefineUser.Address);
		lblShpadd.setBounds(120, 111, 132, 14);
		frame.getContentPane().add(lblShpadd);
		
		JLabel lblShptot = new JLabel("$15.99");
		lblShptot.setBounds(130, 137, 122, 14);
		frame.getContentPane().add(lblShptot);
		

		
		
		
		double shipping = 15.99;
		double item = 15.99;
		double total = shipping + item;
		JFormattedTextField formattedTextField = new JFormattedTextField(total);
		formattedTextField.setVerifyInputWhenFocusTarget(false);
		formattedTextField.setOpaque(false);
		formattedTextField.setFocusable(false);
		formattedTextField.setEditable(false);
		formattedTextField.setBounds(130, 162, 66, 20);
		frame.getContentPane().add(formattedTextField);
	
		
	}

	private void toArrayList(ArrayList<orderPackage.Order> orders) {
		
	}
}
