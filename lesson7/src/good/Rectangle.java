package good;

public class Rectangle extends ClosedCurve implements Polygon {
	double lenght;
	double width;

	public Rectangle(double length, double width) {
		this.lenght = length;
		this.width = width;
	}

	@Override
	double computeArea() {
		return lenght * width;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (getLenght() + getWidth());
	}

}
