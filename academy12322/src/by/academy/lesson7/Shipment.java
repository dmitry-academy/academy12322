package by.academy.lesson7;

public class Shipment extends HeavyBox {
	public double cost;

	public Shipment(int width, int height, int depth, int weight, double cost) {
		super(width, height, depth, weight);
		this.cost = cost;
	}

	public Shipment(double cost) {
		super();
		this.cost = cost;
		System.out.println("Shipment");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shipment [cost=");
		builder.append(cost);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}
	
	
}