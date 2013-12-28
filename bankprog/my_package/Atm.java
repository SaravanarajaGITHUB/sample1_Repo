package my_package;

public class Atm 
{

	private int accountNumber;
	private Account customerAccount;

	public Atm(int accountNumber)
	{
		this.accountNumber = accountNumber;
		customerAccount = Account_list.getAccountDetails(this.accountNumber);
	}

	public int get_balance()
	{
		return customerAccount.getbalance();
	}

	public int withdraw(int amount)
	{
		return customerAccount.withdraw(amount);
	}

}



