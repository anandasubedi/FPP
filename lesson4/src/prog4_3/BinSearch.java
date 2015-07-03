package prog4_3;

import java.lang.Character.Subset;

public class BinSearch {

	public static void main(String[] args) {
		
		String str = "abcdefghigk";
		char ch = 'c';
		
		System.out.print(search(str,ch,str.length()));

	}
	
	public static boolean search(String str, char ch, int length){
		
		if(str.length()==0){
			return false;
		}
		if(str.charAt(0)==ch){
			if(str.length()>length)
				return true;
		}
		return search(str.substring(1, str.length()-1), ch, length);
	}

}
