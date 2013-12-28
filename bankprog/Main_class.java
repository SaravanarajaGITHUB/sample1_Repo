import my_package.*;

public class Main_class 
{
	

		
		public static void main(String[] args) 
		{
			Account obj1 = new Account("Raja","Male");
			Account_list.addAccountToList(obj1);
			
			Account obj2 = new Account("Rani","Female",10000);
			Account_list.addAccountToList(obj2);
			
			Atm atmobj1 =  new Atm(1000);
			System.out.println(String.format("%d has balance: %d", 1000, atmobj1.get_balance()));
			
			int updatedBalance = atmobj1.withdraw(1001);
			System.out.println(String.format("%d has balance: %d", 1000, atmobj1.get_balance()));
			Atm atmobj2 =  new Atm(1001);
			System.out.println(String.format("%d has balance: %d", 1001, atmobj2.get_balance()));
			
			int updateBalance = atmobj2.withdraw(1000);
			System.out.println(String.format("%d has balance: %d", 1001, atmobj2.get_balance()));
			
			//Net_banking Obj1= new Net_banking(1000);
			//int updateBalance = Obj1.deposit(2000);
			//System.out.println(String.format("%d has balance: %d", 1000, Obj1.get_balance()));

		}

	
}
