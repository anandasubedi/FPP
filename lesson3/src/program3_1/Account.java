package program3_1;

class Account {
	
		private final static double DEFAULT_BALANCE = 0.0;
		private double balance;
		private AccountType acctType;
		private Employee employee;
		
		Account(Employee emp, AccountType acctType, double balance){
			employee = emp;
			this.acctType =acctType;
			this.balance = balance;
		}
		Account(Employee emp, AccountType acctType){
			this(emp,acctType,DEFAULT_BALANCE);	
			
			
		}
		
		public static void main(String[] args){
			
			Employee emp = new Employee("Ananda" , 50000, 1991, 04, 27);
			Account acc1 = new Account(emp, AccountType.CHECKING,300);
			Account acc2 = new Account(emp, AccountType.SAVINGS,300);
			Account acc3 = new Account(emp, AccountType.RETIREMENT,300);
			
			System.out.println(acc1.toString());
			System.out.println(acc2.toString());
			System.out.println(acc3.toString());
			
		}
		
		public String toString() {
			return "type = "+acctType+", balance = "+balance;
	    }

		public void makeDeposit(double deposit) {
			this.balance += deposit;
		}
		public boolean makeWithdrawal(double amount) {
			if(this.balance >=amount){
				this.balance-=amount;
				return true;
			}
				
			return false;
		}
		
		public AccountType getAccType(){
			return this.acctType;
		}
		
		public double getBalance(){
			return this.balance;
		}
		
	}

