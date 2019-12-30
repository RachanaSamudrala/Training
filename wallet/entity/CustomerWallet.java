package wallet.entity;

public class CustomerWallet {

	private String mobileNo;
	private String name;
	private double balance;
	
	public CustomerWallet()
	{
		
	}

	public CustomerWallet(String mobileNo, String name, double balance) 
	{
		this.mobileNo = mobileNo;
		this.name = name;
		this.balance = balance;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void transferAmount(CustomerWallet c , double amount)
	{
		if(balance>amount)
		{	
		this.balance = balance - amount;
		c.balance = c.balance + amount;
		System.out.println("\nAmount transferred");
		}
		else
		{
		System.out.println(this.getName() + " has insufficient balance");	
		}
	}
	
	







}

