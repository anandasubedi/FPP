package prog5_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account retirementAcct;
	private Account savingsAcct;
	private Account checkingAcct;
	
	private String name;
	private Date hireDate;

	Employee(String aName, int aYear, int aMonth, int aDay) {
		name = aName;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDate = cal.getTime();
	}

	public String getName() {
		return name;
	}

	public Date getHireDay() {
		return (Date) hireDate.clone();
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
		default:
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {

		boolean flag = false;
		switch (acctType) {
		case CHECKING:
			flag = checkingAcct.makeWithdrawal(amt);
			break;
		case SAVINGS:
			flag = savingsAcct.makeWithdrawal(amt);

		case RETIREMENT:
			flag = retirementAcct.makeWithdrawal(amt);
		default:
			break;
		}
		return flag;
	}

	public String getFormattedAcctInfo() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getName());
		stringBuilder.append("\n\n");

		if (retirementAcct != null) {
			stringBuilder.append(retirementAcct);
		}
		if (checkingAcct != null) {
			stringBuilder.append(checkingAcct);
		}
		if (savingsAcct != null) {
			stringBuilder.append(savingsAcct);
		}

		return stringBuilder.toString();

	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public void setName(String name) {
		this.name = name;
	}

}