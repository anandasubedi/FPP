package lab7.case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private double salary;
	private String name;
	private GregorianCalendar dob;
	Person person;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		/*
		 * this.name = name; this.dob = dob; this.salary = salary;
		 */
	}

	public double getSalary() {
		return salary;
	}

	public boolean equals(Object obj) {

		PersonWithJob pwj = (PersonWithJob) obj;
		Person p = new Person(pwj.name, pwj.dob);
		if (person.equals(p) && pwj.getSalary() == (getSalary())) {
			return true;
		} else
			return false;

	}
}
