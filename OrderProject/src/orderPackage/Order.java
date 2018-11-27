package orderPackage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
			String item = sc.next();
			double price = sc.nextDouble();
		}
	}
	public String item;
	public double price;
	public double shipping = 14.99;
	public int quantity[] = {1, 2, 3, 4, 5};
	public String shippingAddress;
	public double cost = price + shipping;
}


