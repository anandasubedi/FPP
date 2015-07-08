package good;

public class Test2 {
	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3),
				new Rectangle(3, 4) };
		// compute areas
		for (Polygon p : objects) {
			System.out.println(p.getNumberOfSides());
			System.out.println(p.computePerimeter());

		}
	}
}