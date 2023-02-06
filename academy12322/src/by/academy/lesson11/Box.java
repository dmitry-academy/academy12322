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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(items);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (!Arrays.deepEquals(items, other.items))
			return false;
		return true;
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
