package flow.subflow.AccountBalance;

public class BankAccounts {
	
	    public int customerId;
	    public long accountNumber;
	    public int balance;
	    public Users users;
	    
		public BankAccounts() {
			super();
		}

		public BankAccounts(int customerId, long accountNumber, int balance, Users users) {
			super();
			this.customerId = customerId;
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.users = users;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public long getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public Users getUsers() {
			return users;
		}

		public void setUsers(Users users) {
			this.users = users;
		}

	    
	    
}
