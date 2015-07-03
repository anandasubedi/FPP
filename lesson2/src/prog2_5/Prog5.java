package prog2_5;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String reverseStr = "";
		for(int i=str.length()-1;i>=0;i--){
			reverseStr+=str.charAt(i);
		}
		System.out.println("The reverse of the string is "+ "\""+ reverseStr+"\" ");
	}

}
