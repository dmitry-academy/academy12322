package by.academy.lesson11;

import java.util.Arrays;

public class Box<T> {

	private T[] items;

	@SuppressWarnings("unchecked")
	public Box() {
		super();
		this.items = (T[]) new Object[10];
	}

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	public void addItem() {
		// TODO
	}

	public T getItem(int i) {
		// TODO
		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [items=");
		builder.append(Arrays.toString(items));
		builder.append("]");
		return builder.toString();
	}

}
