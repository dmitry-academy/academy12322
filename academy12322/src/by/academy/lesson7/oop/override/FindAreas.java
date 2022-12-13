package by.academy.lesson7.oop.override;

public class FindAreas {
	public static void main(String[] args) {
		Figure[] figures = new Figure[3];
		figures[0] = new Figure(10, 10);
		figures[1] = new Rectangle(10, 10);
		figures[2] = new Triangle(10, 10);

		for (Figure figure : figures) {
			System.out.println(figure.area());
		}

//		Figure figure = new Figure(10, 10);
//		Rectangle rectangle = new Rectangle(10, 10);
//		Triangle triangle = new Triangle(10, 10);
//		((Rectangle)figure).area();
//		rectangle.area();
//		triangle.area();
	}
}