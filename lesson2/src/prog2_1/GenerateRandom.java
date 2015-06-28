package prog2_1;


import random.RandomNumbers;

public class GenerateRandom {
	
	private static final double PI = 3.1413;

	public static void main(String[] args){
		
		RandomNumbers rd = new RandomNumbers();
		int x = rd.getRandomInt(1, 9);
		int y = rd.getRandomInt(1, 9);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("the power of pi to x is  "+Math.pow(PI, x));
		System.out.println("the power of y to pi is  "+Math.pow(y, PI));
		
	}
}