package prog2_9;

import random.RandomNumbers;

public class FormatQuestion {

	public static void main(String[] args) {
		
		int[] numbers = new int[16];
		RandomNumbers rd = new RandomNumbers();
		
		for(int i=0;i<numbers.length;i++){
			numbers[i] = rd.getRandomInt(2, 99);
		}
		for(int i=0;i<16;i++){
			System.out.printf("%9d %9d %9d %9d %n", numbers[++i], numbers[++i], numbers[++i], numbers[++i]);
			System.out.printf("%6s %2d %6s %2d %6s %2d %6s %2d %n","+", numbers[++i],"+", numbers[++i],"+", numbers[++i],"+", numbers[i]);
			System.out.printf("%9s %9s %9s %9s %n %n %n","_____", "_____","_____", "_____");
		}
		
		
	}

}
