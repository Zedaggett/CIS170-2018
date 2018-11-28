package orderPackage;

import javax.swing.JTextField;

public class User {
	
	/*
	 * Here is where User info will be housed
	 * First Name
	 * Last Name
	 * Email
	 * Password
	 * Address
	 */


	public JTextField firstName;
	public JTextField lastName;
	public JTextField eMail;
	public JTextField address;
	public JTextField password;
	public JTextField ID;
	
	public JTextField getID() {
		return ID;
	}
	public void setID(JTextField iD) {
		ID = iD;
	}
	public JTextField getFirstName() {
		return firstName;
	}
	public void setFirstName(JTextField firstName) {
		this.firstName = firstName;
	}
	public JTextField getLastName() {
		return lastName;
	}
	public void setLastName(JTextField lastName) {
		this.lastName = lastName;
	}
	public JTextField geteMail() {
		return eMail;
	}
	public void seteMail(JTextField eMail) {
		this.eMail = eMail;
	}
	public JTextField getAddress() {
		return address;
	}
	public void setAddress(JTextField address) {
		this.address = address;
	}
	public JTextField getPassword() {
		return password;
	}
	public void setPassword(JTextField password) {
		this.password = password;
	}
	
	
}
