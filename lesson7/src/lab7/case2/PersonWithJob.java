package lab7.case2;

import java.util.GregorianCalendar;

import lab7.case1.Person;

public class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object ob) {
		if (this.getClass() != ob.getClass())
			return false;
		PersonWithJob personWithJob = (PersonWithJob) ob;
		if (super.equals(ob) && personWithJob.getSalary() == (getSalary())) {
			return true;
		} else
			return false;
	}

}
