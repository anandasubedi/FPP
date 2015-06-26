package prog4_2;

import java.util.Scanner;

public class MinSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.nextLine();
		System.out.println("The sorted string using recursion is "+ sort(str));
	}
	
	public static String sort(String str){
		
		if(str.length()==0)
			return "";
		int minAt=0;
		char min = str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i) < min){
				min = str.charAt(i);
				minAt = i;
			}
		}
		return ""+min+sort(str.substring(0, minAt)+str.substring(minAt+1, str.length()));
	}

}
