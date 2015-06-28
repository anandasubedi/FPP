package prog2_3;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("The binary representaion of the number is: "+ Integer.toBinaryString(number));
		System.out.println("The hexadecimal representaion of the number is: "+ Integer.toHexString(number));
		
		
	}

}
