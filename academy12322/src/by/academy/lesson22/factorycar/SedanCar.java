package by.academy.lesson22.factorycar;

public class SedanCar extends Car {

	private String piataiaDver;

	public SedanCar() {
		super();
	}

	public SedanCar(String number, String color, String model, double maxSpeed, String piataiaDver) {
		super(number, color, model, maxSpeed);
	}

	public String getPiataiaDver() {
		return piataiaDver;
	}

	public void setPiataiaDver(String piataiaDver) {
		this.piataiaDver = piataiaDver;
	}

}
