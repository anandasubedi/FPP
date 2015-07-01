package prog3_2;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		/*
		 * update, using LocalDate GregorianCalendar cal = new
		 * GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire); hireDate =
		 * cal.getTime();
		 */
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);

	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		// checkingAcct.setEmployee(this);
		// checkingAcct.setAcctType(AccountType.CHECKING);
		// checkingAcct.setBalance(startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		// retirementAcct.setBalance(startAmount);

	}

	public String getFormattedAcctInfo() {
		String output = "";
		output += "\n\nACCOUNT INFO FOR " + getName() + ":\n";
		if (checkingAcct!=(null)) {
			output += checkingAcct.toString();
		}
		if (savingsAcct!=(null)) {
			output += savingsAcct.toString();
		}
		if (retirementAcct!=(null)) {
			output += retirementAcct.toString();
		}
		return output;
	}

	public void deposit(String acctType, double amt) {
		if (acctType.equals(AccountType.CHECKING)) {
			checkingAcct.makeDeposit(amt);
		} else if (acctType.equals(AccountType.SAVINGS)) {
			savingsAcct.makeDeposit(amt);
		} else if (acctType.equals(AccountType.RETIREMENT)) {
			retirementAcct.makeDeposit(amt);
		}
	}

	public boolean withdraw(String acctType, double amt) {
		boolean makeWithdrawal = false;
		if (acctType.equals(AccountType.CHECKING)) {
			makeWithdrawal = checkingAcct.makeWithdrawal(amt);
		} else if (acctType.equals(AccountType.SAVINGS)) {
			makeWithdrawal = savingsAcct.makeWithdrawal(amt);
		} else if (acctType.equals(AccountType.RETIREMENT)) {
			makeWithdrawal = retirementAcct.makeWithdrawal(amt);
		}
		return makeWithdrawal;
	}

}
