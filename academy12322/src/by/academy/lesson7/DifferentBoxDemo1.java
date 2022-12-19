package by.academy.lesson7;

public class DifferentBoxDemo1 {
	public static void main(String[] args) {
		Box box = new Box(15, 10, 25);
		HeavyBox heavyBox = new HeavyBox(15, 10, 20, 5);
		heavyBox.getVolume();
		heavyBox.print();
		
		ColorBox colorBox = new ColorBox(25, 12, 20, "красный");

		box.print();
		heavyBox.printSomething();
		colorBox.paint();

		System.out.println("Объём коробки: " + box.getVolume());
		System.out.println("Объём коробки: " + heavyBox.getVolume() + " Вес коробки: " + heavyBox.weight);
		System.out.println("Объём коробки: " + colorBox.getVolume() + " Цвет коробки: " + colorBox.color);
	}
}