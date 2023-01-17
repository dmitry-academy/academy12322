package by.academy.lesson14.map;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//Создайте HashMap, содержащий пары значений  - 
//имя игрушки и объект игрушки (класс Toy).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.
public class ToyDemo {

	public static void main(String[] args) {
		Map<Toy, String> map1 = new TreeMap<>(new Comparator<Toy>() {
			@Override
			public int compare(Toy o1, Toy o2) {
				if (o1.getColor().equals(o2.getColor())) {
					return o1.compareTo(o2);
				}
				return o1.getColor().compareTo(o2.getColor());
			}
		});

		map1.put(new Toy("ВМашинка", "ВКрасный"), "100 рублей");
		map1.put(new Toy("БЛего", "АРазный"), "много рублей");
		map1.put(new Toy("Анабор молодого дальтоника", "Бкакая разница"), "не очень много рублей");

		printValueAndKey(map1);

//		printKey(map1);
//		printValue(map1);
//		printValueAndKey(map1);
	}

	public static void printKey(Map<String, Toy> map1) {
		for (String key : map1.keySet()) {
			System.out.println(key);
		}
	}

	public static void printValue(Map<String, Toy> map1) {
		for (Toy value : map1.values()) {
			System.out.println(value);
		}
	}

	List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9);

	public static void printValueAndKey(Map<Toy, String> map1) {
		for (Entry<Toy, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
