package minhnhut.desktop;

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer1 = new Customer("1", "Nguyen Van A", 20, "Can Tho");
		System.out.println(customer1);
		
		Customer customer2 = new Customer("2", "Nguyen Van B", 30, "Ho Chi Minh");
		System.out.println(customer2);
		
		customer1.setName("Nguyen Van C");
		System.out.println("Customer 2: Name = " + customer2.getName());
	}

}
