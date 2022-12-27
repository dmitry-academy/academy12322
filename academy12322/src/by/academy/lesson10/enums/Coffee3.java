package by.academy.lesson10.enums;

public class Coffee3 {
//	enum CoffeeSize {
//		BIG, HUGE, OVERWHELMING
//	}

	CoffeeSize3 size;

	double price;
	String color = "black";
	boolean withMilk = false;

	public CoffeeSize3 getSize() {
		return size;
	}

	public void setSize(CoffeeSize3 size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWithMilk() {
		return withMilk;
	}

	public void setWithMilk(boolean withMilk) {
		this.withMilk = withMilk;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coffee3 [size=");
		builder.append(size);
		builder.append(", price=");
		builder.append(price);
		builder.append(", color=");
		builder.append(color);
		builder.append(", withMilk=");
		builder.append(withMilk);
		builder.append("]");
		return builder.toString();
	}

}