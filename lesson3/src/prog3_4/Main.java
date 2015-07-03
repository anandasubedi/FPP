package prog3_4;

public class Main {
	public static void main(String[] args) {
		Triangle t = new Triangle(3, 6);
		System.out.println("Area of first triangle is "+t.computeArea());
		Rectangle r = new Rectangle(5, 5);
		System.out.println("Area of rectangle is "+r.computeArea());
		Circle c = new Circle(5);
		System.out.println("Area of Circle is "+c.computeArea());

		Triangle t2 = new Triangle(3, 4, 5);
		System.out.println("Area of second triangle is "+t2.computeArea());

	}
}
