package by.academy.lesson8.classwork;

public class Cat implements Eatable, Walkable, Sleepable {

	private String nickname;
	private int age;
	public static double money;

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static double getMoney() {
		return money;
	}

	public static void setMoney(double money) {
		Cat.money = money;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [nickname=");
		builder.append(nickname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", money=");
		builder.append(money);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void sleep() {
		System.out.println("sleep cat");
	}

	@Override
	public void walk() {
		System.out.println("walk cat");
	}

	@Override
	public void eat() {
		System.out.println("eat cat");
	}

}
