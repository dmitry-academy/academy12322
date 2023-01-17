package by.academy.lesson14.map;

public class Toy implements Comparable<Toy> {

	private final String name;
	private final String color;

	public Toy(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	@Override
	public int compareTo(Toy o) {
		return name.compareTo(o.getName());
	}

	public final String getColor() {
		return color;
	}

	public final String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Toy other = (Toy) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Toy [name=");
		builder.append(name);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

}
