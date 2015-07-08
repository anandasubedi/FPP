package employe;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Professor professor=new Professor("rob", new Date(), 2000, 10);
		professor.setNumberOfPublications(10);
*/
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = new Professor("micthell", new Date(), 2000, 10);
		department[1] = new Professor("rob", new Date(), 2000, 10);
		department[2] = new Professor("bob", new Date(), 2000, 10);

		department[3] = new Secretary("micthell", new Date(), 2000, 10);
		department[4] = new Secretary("rob", new Date(), 2000, 10);

		System.out.println(department[0]);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print sum salary y/n");
		String ans = sc.nextLine();
		if (ans.equals("y")) {
			double salarySum = 0;
			for (DeptEmployee d : department) {
				salarySum += d.computeSalary();
			}
			System.out.println("Total salary amount ::"+salarySum);

		}
		sc.close();

	}

}
