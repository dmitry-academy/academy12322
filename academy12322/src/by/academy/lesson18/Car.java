package by.academy.lesson18;

import jdk.jfr.Description;

@Description("the power of an engine")
public class Car extends Vehicle {

	@Description("the power of an engine")
	private int horsepower = 1;
	private final String serialNumber;

	public Car() {
		serialNumber = "123";
	}

	public Car(int horsepower, String serialNumber) {
		this.horsepower = horsepower;
		this.serialNumber = serialNumber;
	}

	@Description("the power of an engine")
	public final int getHorsepower() {
		return horsepower;
	}

	void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	protected void printSerialNumber() {
		System.out.println(serialNumber);
	}

	private void startEngine() {
		System.out.println("Wroooommmm");
	}

	public <T> T logAndReturn(@Deprecated T type) throws IllegalAccessException {
		System.out.println(type);
		return type;
	}

	public <T extends RuntimeException> void exceptionExample() throws T {
	}

	@Override
	public String toString() {
		System.out.println("asdasd");
		StringBuilder builder = new StringBuilder();
		builder.append("Car [horsepower=");
		builder.append(horsepower);
		builder.append(", serialNumber=");
		builder.append(serialNumber);
		builder.append("]");
		return builder.toString();
	}

	public void printObject() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [horsepower=");
		builder.append(horsepower);
		builder.append(", serialNumber=");
		builder.append(serialNumber);
		builder.append("]");
		System.out.println(builder.toString());
	}

}