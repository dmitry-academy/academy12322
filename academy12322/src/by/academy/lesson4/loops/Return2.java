package by.academy.lesson4.loops;

public class Return2 {
	public static void main(String[] args) {
		double d = getRandomValue(3);
		System.out.println(d);
	}

	public static double getRandomValue(int i) {
		return Math.random() * i;
	}
	
	public static boolean lessThan(double a, double b, double epsilon){
	    return b - a > epsilon;
	}
}