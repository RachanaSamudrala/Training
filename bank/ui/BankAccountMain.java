package bank.ui;

import bank.entity.BankAccount;

public class BankAccountMain {
	
	public static void main(String[] args)
	{
		BankAccount[] store = new BankAccount[4];
		store[0] = new BankAccount(1 , "Rachana" , 1000);
		store[1] = new BankAccount(2 , "Alekya" , 2000);
		store[2] = new BankAccount(3 , "Harika" , 3000);
		store[3] = new BankAccount(4 , "Nandini" , 2500);
		
		store[0].addBalance(500);
		store[2].transferAmount(store[3], 1000);
		
		BankAccountMain m = new BankAccountMain();
		m.print(store);
				
	}

	private void print(BankAccount[] store) 
	{
		
		System.out.println("Account Details:");
		for(BankAccount b : store)
		{
			if(b!=null)
			{
				System.out.println("Id : "+ b.getId()+ ", Name : "+b.getName()+", Balance : "+b.getBalance());	
			}
		}
		
	}

}
