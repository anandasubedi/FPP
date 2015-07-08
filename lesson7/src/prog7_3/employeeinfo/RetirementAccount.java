package prog7_3.employeeinfo;

public class RetirementAccount extends Account {

	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - (2 / 100) * baseBalance;
	}

	public String toString() {
		return getAcctType().toString() + " " + getBalance() + "\n";
	}
}
