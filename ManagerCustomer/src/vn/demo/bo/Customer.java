package vn.demo.bo;

public class Customer {
	public int id; 
	public String username; 
	public String password;
	public String address;
	
	public Customer(String string, String string2, String string3) {
		
	}
	public Customer(int id, String username, String password, String address) {
		super();
		this.id = id; 
		this.username = username; 
		this.password = password; 
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
