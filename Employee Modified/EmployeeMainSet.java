package rachanajava;
import java.util.*;

public class EmployeeMainSet 
{
	public static void main(String[] args) 
	{
		
		EmployeeMainSet m = new EmployeeMainSet();
		m.execute();
		
	}
	
	Map<Integer , Employee>  store = new HashMap<>();
	
	public void execute()
	{
		
		Employee e1 = new Employee(101, "Joe" , 1000.0);
		Employee e2 = new Employee(102, "sam", 500.0);
		Employee e3 = new Employee(103, "john", 500.0);
		
		store.put(1 , e1);
		store.put(2 , e2);
		store.put(3 , e3);

		Manager e = new Manager(112,"Sammy");
		store.put(4 , e);
		
		e.addmanagedEmployees(e1);
		e.addmanagedEmployees(e2);
		
		print();
		//Employee fetched = findById(2);
		//System.out.println(fetched.getName());

	}
	
	public Employee findById(int id)
	{
		Employee e = store.get(id);
		return e;
	}

	public void print()
	{
		Set<Integer> keys = store.keySet();
		System.out.println("Employees : ");
		for(Integer k : keys) {
			Employee e = store.get(k);
			System.out.println(e.getId() + " "+  e.getName()+" " +e.getBalance());
			boolean isManager = e instanceof Manager;
			if(isManager)
			{
				Manager m= (Manager) e;
				System.out.println("Managed Employees:");
				Employee[] managedEmployees = m.getManagedEmployees();
				for(Employee managed : managedEmployees)
				{
					if(managed!=null) {
						System.out.println(managed.getName() + " " + managed.getBalance());
					}
				}
			}
		}
	}
}
