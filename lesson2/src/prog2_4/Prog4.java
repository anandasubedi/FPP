package prog2_4;
public class Prog4 {

	public static void main(String[] args) {
		String myString = Data.records;
		String[] out = myString.split(":");

		for (int i = 0; i < out.length; i++) {
			String[] record = out[i].split(",");
			System.out.println(record[0]);
		}

	}

}
