package orderPackage;

public class Address {
	Address a = new Address();
	
	public static String street;
	public String state;
	public String zip;
	public String city;
	public static String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		Address.street = "225 Tri City Road";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	{
	
	Address.street = "225 Tri City Road";
	this.state = "New Hampshire";
	this.zip = "03878";
	this.city = "Somersworth";
	
	}
}
