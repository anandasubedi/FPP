package prog3_4;

public final class Rectangle {
	private final double lenght;
	private final double breadth;

	public Rectangle(double length, double breadth) {
		this.lenght = length;
		this.breadth = breadth;

	}

	public double getLenght() {
		return lenght;
	}

	public double getBreadth() {
		return breadth;
	}

	public double computeArea() {
		return lenght * breadth;
	}
}
