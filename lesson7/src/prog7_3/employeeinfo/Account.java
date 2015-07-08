package prog7_3.employeeinfo;

public class Account {
	/*
	 * public final static String CHECKING = "checking"; public final static
	 * String SAVINGS = "savings"; public final static String RETIREMENT =
	 * "retirement";
	 */
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	@Override
	public String toString() {
		return "balance = " + balance + "\n";
	}

	public void makeDeposit(double deposit) {
		// implement
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		boolean isDrawn = false;
		if (balance > amount) {
			balance = balance - amount;
			isDrawn = true;
		}
		return isDrawn;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}