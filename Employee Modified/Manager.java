package rachana;

public class Manager extends Employee 
{
	
	int i=0;
	private Employee managedEmployees[] = new Employee[2];
	
	public Employee[] getManagedEmployees()
	{
		return managedEmployees;
	}
	
	public Manager(int id , String name)
	{
		super(id,name);
	}	

	public void addmanagedEmployees(Employee e)
	{
		managedEmployees[i]=e;
		i++;
	}
}
