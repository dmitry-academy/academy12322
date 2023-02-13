package by.academy.lesson22.factorycar;

import java.util.Map;

public class CarFactory {

	public static Car buildCar(CarType type, Map<String, String> params) {

		switch (type) {
		case SEDAN:
			
			SedanCar car = new SedanCar();
			
			if(params.containsKey("maxSpeed")) {
				car.setMaxSpeed(Double.valueOf(params.get("maxSpeed")));
			}
			
			return car;
//			return new SedanCar(params.get("number"), params.get("color"), params.get("model"),
//					Double.valueOf(params.get("maxSpeed")), params.get("piataiaDver"));
		case SPORT:
			return new SportCar(params.get("number"), params.get("color"), params.get("model"),
					Double.valueOf(params.get(params.get("maxSpeed"))), "Красивый спойлер");
		case SMALL:
			return new SmallCar(params.get("number"), params.get("color"), params.get("model"),
					Double.valueOf(params.get(params.get("maxSpeed"))));
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
