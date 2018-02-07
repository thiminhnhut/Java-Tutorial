package minhnhut.desktop;

public class Customer {
	private String name;
	private String id;
	private String address;
	private int old;
	
	public Customer() {
		
	}
	public Customer(String id, String name, int old, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.old = old;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getOld() {
		return this.old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", address=" + address + ", old=" + old + "]";
	}
	
	
	
}
