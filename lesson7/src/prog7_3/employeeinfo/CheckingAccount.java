package prog7_3.employeeinfo;

import java.time.LocalDate;

public class CheckingAccount extends Account {
	int previous;
	boolean isFirst = false;

	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}

	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

	@Override
	public double getBalance() {
		double newBalance = 0;
		int currentMonth = LocalDate.now().getMonthValue();
		if (currentMonth != previous) {
			isFirst = true;
			double baseBalance = super.getBalance();
			newBalance = baseBalance - 5;
			super.makeWithdrawal(5);

		} else
			newBalance = super.getBalance();

		if (isFirst) {
			previous = currentMonth;
		}
		return newBalance;
	}

	public String toString() {
		return getAcctType().toString() + " " + getBalance() + "\n";
	}
}
