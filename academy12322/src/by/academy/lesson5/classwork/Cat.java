package by.academy.lesson5.classwork;

public class Cat {

	public String name;

	public void jump() {
		System.out.println("Jump, cat, jump!");
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
