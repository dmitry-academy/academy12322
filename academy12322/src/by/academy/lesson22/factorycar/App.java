package by.academy.lesson22.factorycar;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		Map<String, String> params = new HashMap<>();
		params.put("model", "Model X");
		params.put("number", "123123123");
		Car car = CarFactory.buildCar(CarType.SEDAN, params);

		ServiceFactory.getService("user").serve(null);
		ServiceFactory.getService("deal").serve(null);

		doSmth(ServiceFactory.getService("deal"));
		doSmth(ServiceFactory.getService("user"));
		doSmth(ServiceFactory.getService("product"));
	}

	public static void doSmth(Service service) {
		service.serve(null);
	}
}
