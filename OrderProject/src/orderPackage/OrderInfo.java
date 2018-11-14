package orderPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenuBar;
import java.awt.ScrollPane;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.Choice;

public class OrderInfo {

	private JFrame frame;

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFinalizeOrder = new JButton("Finalize Order");
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
		choice.setBounds(159, 81, 146, 22);
		frame.getContentPane().add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(159, 132, 146, 22);
		frame.getContentPane().add(choice_1);
	}
}
