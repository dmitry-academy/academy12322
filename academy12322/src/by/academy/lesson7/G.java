package by.academy.lesson7;

public class G extends F {

	public G() {
		super(67);
		System.out.println(i);

		System.out.println(super.i);
		System.out.println(super.getI());

		System.out.println("В конструкторе G");
	}

	public int getSomeInt() {
		return i;
	}
}