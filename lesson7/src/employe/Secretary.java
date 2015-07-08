package employe;

import java.util.Date;

public class Secretary extends DeptEmployee {

	private double overtimeHours;

	public Secretary(String name, Date date, double salary, double overTimeHours) {
		super(name, date, salary);
		this.overtimeHours = overTimeHours;
		// TODO Auto-generated constructor stub
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		return super.computeSalary() + 12 * getOvertimeHours();
	}

}
