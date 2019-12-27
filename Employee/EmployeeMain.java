package rachana;

public class EmployeeMain 
{
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Joe" , 1000.0);
		Employee e2 = new Employee(102, "sam", 500.0);
		Employee e3 = new Employee(103, "john", 500.0);

		Employee store[] = new Employee[4];

		store[0]=e1;
		store[1]=e2;
		store[2]=e3;
		store[0].addSalary(1000.0);
		store[1].addSalary(500.0);
		store[2].addSalary(1200.0);

		Manager e = new Manager(112,"Sammy");
		e.addmanagedEmployees(store[0]);
		e.addmanagedEmployees(store[1]);
		store[3]=e;

		EmployeeMain m = new EmployeeMain();
		m.print(store);

		}

	public void print(Employee[] store)
	{
		for(Employee e : store) {
			System.out.println(e.getName()+" " +e.getBalance());
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
