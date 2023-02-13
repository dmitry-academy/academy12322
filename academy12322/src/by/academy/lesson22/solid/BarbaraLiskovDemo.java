package by.academy.lesson22.solid;

public class BarbaraLiskovDemo {

	private static Engine engine;

	public static void main(String[] args) {
		engine = new FuelEngine();

		engine.run();
	}

}
