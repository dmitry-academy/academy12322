package by.academy.lesson8.classwork;

public class Dog implements Eatable, Walkable, Sleepable {

	@Override
	public void sleep() {
		System.out.println("sleep Dog");
	}

	@Override
	public void walk() {
		System.out.println("walk Dog");
	}

	@Override
	public void eat() {
		System.out.println("eat Dog");
	}

}
