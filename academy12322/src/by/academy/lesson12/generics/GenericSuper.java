package by.academy.lesson12.generics;

public class GenericSuper<T> {
	private T ob;

	public GenericSuper(T ob) {
		this.ob = ob;
	}

	private T getOb() {
		return ob;
	}
}
