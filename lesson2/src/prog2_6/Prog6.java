package prog2_6;

public class Prog6 {

	public static void main(String[] args) {
		
		String[] str = {"apple","banana","cat","banana","dog","book","cat"};
		
		String[] newStr = removeDups(str);
		for (String st : newStr) {
			System.out.print(st);
		}

	}
	
	public static String[] removeDups(String[] str){
		boolean duplicate;
		int count = 0;
		String[] newStr = new String[str.length];
		for(int i=0;i<str.length;i++){
			duplicate = false;
			for (String s : newStr) {
				if(str[i].equals(s))
					duplicate = true;
			}
			if(duplicate == false){
				newStr[count] = str[i];
				count++;
			}
		}
		return newStr;
	}

}
