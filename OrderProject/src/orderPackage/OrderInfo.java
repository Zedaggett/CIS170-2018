package orderPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.JTextArea;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderInfo {
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderInfo window = new OrderInfo();
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
	public OrderInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFinalizeOrder = new JButton("Finalize Order");
		btnFinalizeOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					OrderFinalDetails window = new OrderFinalDetails();
					window.frame.setVisible(true);
				} catch (Exception t) {
					t.printStackTrace();
				}
			}
		});
		btnFinalizeOrder.setBounds(307, 215, 113, 25);
		frame.getContentPane().add(btnFinalizeOrder);
		
		JTextArea txtrPleasePlaceYour = new JTextArea();
		txtrPleasePlaceYour.setEditable(false);
		txtrPleasePlaceYour.setText("Please place your order below:");
		txtrPleasePlaceYour.setBounds(100, 28, 320, 22);
		frame.getContentPane().add(txtrPleasePlaceYour);
		
		JLabel lblItem = new JLabel("Item:");
		lblItem.setBounds(56, 87, 56, 16);
		frame.getContentPane().add(lblItem);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(56, 138, 56, 16);
		frame.getContentPane().add(lblQuantity);
		
		Choice choice = new Choice();
		choice.add("Pants- $39.99");
		choice.add("Shirt- $25.99");
		choice.add("Shoes- $29.99");
		choice.add("Sunglasses- $2.99");
		choice.add("Gloves- $5.99");
		choice.add("Hat- $5.99");
		choice.setBounds(159, 81, 146, 22);
		frame.getContentPane().add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.add("1");
		choice_1.add("2");
		choice_1.add("3");
		choice_1.add("4");
		choice_1.add("5");
		choice_1.setBounds(159, 132, 146, 22);
		frame.getContentPane().add(choice_1);
	}
}
