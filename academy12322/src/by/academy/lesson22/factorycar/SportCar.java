package by.academy.lesson22.factorycar;

public class SportCar extends Car {

	private String spoiler;

	public SportCar(String number, String color, String model, double maxSpeed, String spoiler) {
		super(number, color, model, maxSpeed);
		this.spoiler = spoiler;
	}

	public String getSpoiler() {
		return spoiler;
	}

	public void setSpoiler(String spoiler) {
		this.spoiler = spoiler;
	}

}
