package prog4_1;

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x : ");
		int x = sc.nextInt();
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
		
		System.out.println("Answer is "+power(x,n));

	}
	
	public static double power(int x, int n){
		if(n==0)
			return 1;
		return x*power(x,--n);
	}

}
