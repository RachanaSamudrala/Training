package bank.entity;

public class BankAccount 
{
	private int id;
	private String name;
	private double balance;
	
	public BankAccount()
	{
		
	}

	public BankAccount(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public void addBalance(double amount)
	{
		balance = balance + amount;
	}
	
	public void transferAmount(BankAccount b , double amount)
	{
		if(this.balance>amount)
		{
		this.balance = this.balance - amount;
		b.balance = b.balance + amount;
		System.out.println("Amount transferred successfully");
		}
		else
		{
		System.out.println(this.getName() + " has Insufficient Balance");
		}
	}
	
}
