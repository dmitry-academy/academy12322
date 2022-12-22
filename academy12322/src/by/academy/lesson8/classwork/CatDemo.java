package by.academy.lesson8.classwork;

public class CatDemo {

	public static void main(String[] args) {
		Cat cat = new Cat("Дядя Петрович");
		walk(cat);
		sleep(cat);
		eat(cat);

		Dog d = new Dog();
		walk(d);
		sleep(d);
		eat(d);
	}

	public static void walk(Walkable w) {
		w.walk();
	}

	public static void sleep(Sleepable w) {
		w.sleep();
	}

	public static void eat(Eatable w) {
		w.eat();
	}
}
