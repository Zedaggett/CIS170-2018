package orderPackage;

import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JList;

public class Service {

/*
 * Here is where a list of Users, Addresses, and Orders will be housed
 */
	public static ArrayList<String> items = new ArrayList<String>();
	public ArrayList<Double>prices = new ArrayList<Double>();
	public static JList<String>itemList;
	public JList<Double>priceList;
	public double shipping = 14.99;
	
	private Scanner sc;
	
	public void openFile() {
		try {
		sc = new Scanner(new File ("Items.txt"));
		}
		catch (Exception e) {
			System.out.println("Could not find file");
		}
	}
	
	public void readFile() {
		
		while (sc.hasNext()) {
			
		items.add(sc.nextLine());
		String[] str = new String[items.size()];
		
	
		prices.add(sc.nextDouble());
		
		itemList = new JList<>(items.toArray(str));
		priceList = new JList<>((Double[]) prices.toArray());
		
		}
	}
	public void closeFile() {
		sc.close();
	}
	static ArrayList<Order> Orders = new ArrayList<Order>();
	ArrayList<User> Users = new ArrayList<User>();
		
	public static void main (String[] args) {
		System.out.println(itemList);
		
		Service s = new Service();
		User u = new User();
		Order o = new Order();
		OrderInfo oI = new OrderInfo();
		
	
		
		
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
}
