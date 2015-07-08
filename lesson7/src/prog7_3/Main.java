package prog7_3;

import java.util.Scanner;

import prog7_3.employeeinfo.Employee;

//import prog7_3.employeeinfo.Employee;

public class Main {

	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		System.out.print("A. See a report of all account balances \n");
		System.out.print("B. Make a deposit.  \n");
		System.out.print("C. Make a withdrawal.  \n");
		System.out.print("Make a Selection A/B/C  \n");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("a")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		} else if (answer.equalsIgnoreCase("b")) {
			for (int i = 0; i < emps.length; i++) {
				System.out.println(i + "." + emps[i].getName() + " \n");
			}
			System.out.println("Select an employee: (type a number)");
			String user = sc.nextLine();
			if (user != null && (Integer.parseInt(user)) < emps.length) {
				System.out.println("0. checking  \n");
				System.out.println("1. savings  \n");
				System.out.println("2. retirement  \n");
				System.out.println("Select an account: (type a number)  \n");
				String accType = sc.nextLine();
				if (accType == "0") {
					//
				}
			}
		}

	}

	String getFormattedAccountInfo() {
		// loop through employees array and get formatted
		// accont info for each employee, and assemble into a string
		StringBuffer sb = new StringBuffer();
		String n = System.getProperty("line.separator");
		for (Employee e : emps) {
			sb.append(e.getFormattedAcctInfo() + n);
		}
		return sb.toString();
	}
}