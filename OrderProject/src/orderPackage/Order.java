package orderPackage;
import java.io.File;
import java.util.ArrayList;

import java.util.Scanner;


public class Order {

	/*
	 * Here is where the order information will be housed
	 * User ID
	 * Item (list of items)
	 * Quantity of item will be defined
	 * Cost
	 * Shipping Address
	 */
	
	
	
	// reading from file to assign items

	public ArrayList<String> items = new ArrayList<String>();
	public ArrayList<String> getItems() {
		return items;
	};
	public void setItems(ArrayList<String> items) {
		this.items = items;
	}
	public ArrayList<Double>prices = new ArrayList<Double>();
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
		prices.add(sc.nextDouble());
		}
	}
	public void closeFile() {
		sc.close();
	}
	

		
	}


