package wallet.ui;
import java.util.*;

import wallet.entity.CustomerWallet;

public class CustomerWalletMain {
	
	public static void main(String[] args)
	{
		
		CustomerWalletMain m = new CustomerWalletMain();
		m.execute();
		
	}
	
	private Map<String , CustomerWallet> store = new LinkedHashMap<>();

	public void execute()
	{
		CustomerWallet c1 = new CustomerWallet("9999911111", "sam", 1000);
		CustomerWallet c2 = new CustomerWallet("9999922222", "john", 2000);
		CustomerWallet c3 = new CustomerWallet("9999933333", "alex", 3000);
		CustomerWallet c4 = new CustomerWallet("9999944444", "bob", 4000);
		
		store.put(c1.getMobileNo(),c1);
		store.put(c2.getMobileNo(),c2);
		store.put(c3.getMobileNo(),c3);
		store.put(c4.getMobileNo(),c4);
		
		print();
		
		c3.transferAmount(c4, 500);
		print();
		
		CustomerWallet fetched = findByMobileNo("9999911111");
		System.out.println("\nFetched Details : ");
		System.out.println(fetched.getName()+ " , "+ fetched.getBalance());

	}
		
	public CustomerWallet findByMobileNo(String mobileNo)
	{
		CustomerWallet c = store.get(mobileNo);
		return c;
	}

	public void print()
	{
		Set<String> keys = store.keySet();
		System.out.println("\nCustomer Details : ");
		for(String mobileNo : keys)
		{
			CustomerWallet c = store.get(mobileNo);
			System.out.println("Mobile Number : " + c.getMobileNo() + " , Name : " + c.getName() + " , Balance : "+c.getBalance());
			
		}
		
	}



}



