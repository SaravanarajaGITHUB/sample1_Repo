package my_package;

public class Account 
{
	private int balance;
	private String name;
	private String gender;
	private int account_no;
	private static int counter=999;
	public Account(String name,String gender)
	{
		this(name,gender,0);
	}
	public Account(String Name ,String Gender, int Balance )
	{
		counter++;
		name =Name;
		gender =Gender;
		balance=Balance;
		account_no=counter;
	}
	public int withdraw(int wd_amt)
	{		
		if (wd_amt>0)	
			if (balance>wd_amt)
			{
				balance -= wd_amt;	
			}
			else
				System.out.println("Failed to withdraw....!!!\nYour balanceis too low to withdraw");
		return(balance);
	}
	public int deposit(int dp_amt)
	{				
		if(dp_amt>0&&balance>0)
			balance += dp_amt;
		return(balance);
	}
	public int getbalance()
	{
		return this.balance;
	}
	public int get_account_num()
	{
		return this.account_no;
	}
	public String get_name()
	{
		return this.name;

	}
	public String get_gender()
	{
		return this.gender;

	}
}





