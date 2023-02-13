package by.academy.lesson22.factorycar;

import java.util.HashMap;
import java.util.Map;

public class ServiceFactory {

	private static Map<String, Service> services = new HashMap<>();

	static {
		services.put("user", new UserService());
		services.put("product", new ProductService());
		services.put("deal", new DealService());
	}

	public static Service getService(String type) {
		return services.get(type);
	}
}
