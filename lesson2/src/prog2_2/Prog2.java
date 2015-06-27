package prog2_2;

public class Prog2 {
	
	public static void main(String[] args){
		
		float f1 = (float) 1.27;
		float f2 = (float) 3.881;
		float f3 = (float) 9.6;
		int sum;
		sum = (int) (f1+f2+f3);
		System.out.println("Sum obtained by casting to type int is "+ sum);
		System.out.println("Sum obtained by rounding off is "+ Math.round(f1+f2+f3));
		
	}

}
