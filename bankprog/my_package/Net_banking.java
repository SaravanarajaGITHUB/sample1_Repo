package my_package;

public class Net_banking {

	private int accountNumber;
	private Account customerAccount;

	public Net_banking(int accountNumber){
		this.accountNumber = accountNumber;
		customerAccount = Account_list.getAccountDetails(this.accountNumber);
	}

	public int get_balance(){
		return customerAccount.getbalance();
	}

	public int withdraw(int amount){
		return customerAccount.withdraw(amount);
	}

	public int deposit(int amount){
		return customerAccount.deposit(amount);
	}
}


