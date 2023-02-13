package by.academy.lesson22.factorycar;

import java.util.Map;

public class DealService implements Service {

	@Override
	public void serve(Map<String, String> params) {
		System.out.println("process deal");
	}

}
