package prog3_4;

public final class Triangle {

	private final double base;
	private final double height;

	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	public Triangle(double side1, double side2, double side3) {
		
		double largest = (side1 > side2 ? side1 : side2);
		double p = (side1 + side2 + side3) / 2;
		this.base = largest > side3 ? largest : side3;
		this.height = 2 / base
				* (Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));

	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea() {
		return (base * height) * 0.5;
	}

}
