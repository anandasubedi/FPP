package prog2_1;

import java.util.Random;

public class GenerateRandom {
	
	public static void main(String[] args){
		
		Random rd = new Random();
		int n = rd.nextInt(9)+1;
		System.out.println("Random number between 1 and 9 is "+n);
	}
}