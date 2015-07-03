package prog2_7;

import java.util.Scanner;

import random.RandomNumbers;

public class RollingDice {

	public static void main(String[] args) {
		RandomNumbers rd = new RandomNumbers();
		int rand;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			rand = rd.getRandomInt(2, 12);
			System.out.print("You got "+rand);
			System.out.println("Try again?");
			ch = sc.next().charAt(0);	
		} while (ch == 'Y' || ch == 'y');

	}

}
