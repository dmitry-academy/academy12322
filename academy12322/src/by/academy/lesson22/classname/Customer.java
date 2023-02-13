package by.academy.lesson22.classname;

import java.util.ArrayList;
import java.util.List;

public class Customer extends PrivilegedCustomer {

	private Long id;
	private String name;
	private List<Address> addresses;
	private List<Order> orders;

	public void addOrder(Order order) {
		if (orders == null) {
			orders = new ArrayList<>();
		}
		orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void addAddress(Address address) {
		if (addresses == null) {
			addresses = new ArrayList<>();
		}
		addresses.add(address);
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
