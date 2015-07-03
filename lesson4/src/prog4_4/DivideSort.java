package prog4_4;

public class DivideSort {
	public static void main(String[] args) {

		System.out.println(divideSort("AnandaSubedi"));
	}

	public static String divideSort(String str) {
		if (str.length() == 0 || str.length() == 1)
			return str;
		int middle = str.length() / 2;

		String sleft = divideSort(str.substring(0, middle));
		String sright = divideSort(str.substring(middle, str.length()));

		return merge(str.toCharArray(), sleft.toCharArray(), sright.toCharArray());
	}

	private static String merge(char[] charArray, char[] sleft, char[] sright) {

		int i = 0, j = 0, k = 0;
		while (sleft.length != j && sright.length != k) {
			if (sleft[j] < sright[k]) {
				charArray[i] = sleft[j];
				i++;
				j++;
			} else {
				charArray[i] = sright[k];
				i++;
				k++;
			}
		}
		while (sleft.length != j) {
			charArray[i] = sleft[j];
			i++;
			j++;
		}
		while (sright.length != k) {
			charArray[i] = sright[k];
			i++;
			k++;
		}

		return String.valueOf(charArray);
	}
}
