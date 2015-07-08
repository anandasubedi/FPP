package prog7_3.employeeinfo;

public class SavingAccount extends Account {
	private static final double interestRate = 0.25;

	SavingAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (interestRate / 100) * baseBalance;
		return baseBalance + interest;
	}

	public String toString() {
		return getAcctType().toString() + " " + getBalance() + "\n";
	}
}
