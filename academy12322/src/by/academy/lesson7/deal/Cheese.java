package by.academy.lesson7.deal;

import java.io.Serializable;

public class Cheese extends Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private int age;

	public Cheese() {
		super();
	}

	public Cheese(String type, String name, double price, double quantity, int age) {
		super(type, name, price, quantity);
		this.age = age;
	}

	@Override
	protected double getDiscount() {
		if (age >= 20) {
			return 0.8; // 20%
		}
		return 1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
