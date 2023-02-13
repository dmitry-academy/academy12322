package by.academy.lesson20.classwork;

import java.util.Random;

public class ShipGenerator extends Thread {
	// 1. Создать класс Ship (потоки), в котором будет рандомно генерироваться количество груза (от 1 до 50) 
	//    и флаг (boolean), который отвечает за загрузку/разгрузку.
	// 2. Создаем класс Port, в котором есть 1000 едениц места. 
	// 3. Написать ShipGenerator (поток), который будет рандомно генерировать объекты Ship из а.
	// 4. В конечном итоге у вас должен получиться порт, который будет загружать/разгружать корабли.
	private Port port;
	private Random rand = new Random();

	public ShipGenerator(Port port) {
		super();
		this.port = port;
	}

	@Override
	public void run() {
		for (;;) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Ship ship = new Ship(port, getRandomInt(), getRandomBoolean());
			System.out.println("Приплыл корабль: " + ship);
			new Thread(ship).start();
		}
	}

	private int getRandomInt() {
		return rand.nextInt(5) + 1;
	}

	private boolean getRandomBoolean() {
		return rand.nextBoolean();
	}
}
