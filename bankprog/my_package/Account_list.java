package my_package;

public class Account_list 
{
	private static Account[] account_list;
	private static int arrayCount = 0;

	static{
		account_list = new Account[10];
	}

	public static void addAccountToList(Account accountObject){
		if(arrayCount < 10)
		{
			account_list[arrayCount] = accountObject;
			arrayCount++;
		}
	}

	public static Account getAccountDetails(int accountNumber){
		Account accountObject = null;

		for(int i = 0 ; i < 10; i++)
		{
			if(account_list[i].get_account_num() == accountNumber)
			{
				accountObject = account_list[i];
				break;
			}
			else
			{
				continue;
			}
		}

		return accountObject;
	}
}

