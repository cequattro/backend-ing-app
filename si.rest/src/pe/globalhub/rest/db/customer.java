package pe.globalhub.rest.db;

public class customer {
	
	private int UUIDCustomer;
	private String name;
	private String surname;
	private String address;
	private String email;
	
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public customer(int uUIDCustomer, String name, String surname,
			String address, String email) {
		super();
		UUIDCustomer = uUIDCustomer;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.email = email;
	}
	public int getUUIDCustomer() {
		return UUIDCustomer;
	}
	public void setUUIDCustomer(int uUIDCustomer) {
		UUIDCustomer = uUIDCustomer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "customer [UUIDCustomer=" + UUIDCustomer + ", name=" + name
				+ ", surname=" + surname + ", address=" + address + ", email="
				+ email + "]";
	}
	
	

}
