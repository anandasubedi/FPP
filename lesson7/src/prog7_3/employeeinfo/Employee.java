package prog7_3.employeeinfo;

import java.util.Date;
import java.util.GregorianCalendar;

import prog7_3.AccountList;

public class Employee {

	AccountList accounts;
	private String name;
	private Date hireDate;

	public Employee(String aName, int aYear, int aMonth, int aDay) {
		accounts = new AccountList();
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
		Account acc = new CheckingAccount(this, startAmount);
		accounts.add(acc);
	}

	public void createNewSavings(double startAmount) {
		Account acct = new SavingAccount(this, startAmount);
		accounts.add(acct);
	}

	public void createNewRetirement(double startAmount) {
		Account acct = new RetirementAccount(this, startAmount);
		accounts.add(acct);
	}

	public void deposit(int accountIndex, double amt) {

		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}

	public boolean withdraw(int accountIndex, double amt) {

		boolean flag = false;
		Account selected = accounts.get(accountIndex);
		if (selected != null) {
			selected.makeWithdrawal(amt);
			flag = true;
		}
		return flag;
	}

	public String getFormattedAcctInfo() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getName());
		stringBuilder.append("\n\n");
		for (int start = 0; start < accounts.size(); start++) {
			stringBuilder.append(accounts.get(start).toString());
			/*
			 * if (ac != null) { if (ac instanceof CheckingAccount) {
			 * stringBuilder.append(((CheckingAccount) ac).getAcctType()
			 * .toString() + "\n" + ac.getBalance() + "\n"); } if (ac instanceof
			 * SavingAccount) { stringBuilder.append(((SavingAccount)
			 * ac).getAcctType() .toString() + "\n" + ac.getBalance() + "\n"); }
			 * if (ac instanceof RetirementAccount) {
			 * stringBuilder.append(((RetirementAccount) ac).getAcctType()
			 * .toString() + "\n" + ac.getBalance() + "\n"); }
			 * 
			 * }
			 */
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