package prog3_4;

public class Circle {
	private static final double PI = 22 / 7;
	private final int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return PI * radius * radius;

	}

	public int getRadius() {
		return radius;
	}
}
