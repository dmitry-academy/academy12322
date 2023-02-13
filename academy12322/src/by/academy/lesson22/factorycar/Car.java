package by.academy.lesson22.factorycar;

import java.util.Objects;

public abstract class Car {

	private String number;
	private String color;
	private String model;
	private double maxSpeed;

	public Car() {
		super();
	}

	public Car(String number, String color, String model, double maxSpeed) {
		super();
		this.number = number;
		this.color = color;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, maxSpeed, model, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(maxSpeed) == Double.doubleToLongBits(other.maxSpeed)
				&& Objects.equals(model, other.model) && Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [number=");
		builder.append(number);
		builder.append(", color=");
		builder.append(color);
		builder.append(", model=");
		builder.append(model);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
		builder.append("]");
		return builder.toString();
	}

}
