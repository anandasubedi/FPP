package good;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(3),new Circle(3),new Rectangle(5,4) };
		// compute areas
		for (ClosedCurve cc : objects) {
			System.out.println(cc.computeArea());

		}

	}

}