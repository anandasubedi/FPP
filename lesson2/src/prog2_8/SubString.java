package prog2_8;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();
		
		for(int size=1;size<=str.length();size++){
			
			System.out.println("The substrings for size " +(size+1) + " are : ");
			for(int c=0;size+c<=str.length();c++){
				System.out.println("["+str.substring(c, size+c)+"]");
			}
		
		}
	}

}
