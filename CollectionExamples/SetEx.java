package CollectionExamples;

import java.util.*;

import rachanajava.Employee;
import rachanajava.EmployeeComparator;

public class SetEx {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "rachana");
		Employee e2 = new Employee(2, "alekya");
		Employee e3 = new Employee(3, "harika");
		Employee e4 = new Employee(4, "abcdef");

		// Set set = new HashSet();
		// Set<Employee> set = new LinkedHashSet();
		
		Comparator<Employee> comparator = new EmployeeComparator();
		Set<Employee> set = new TreeSet(comparator);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);

		int size = set.size();
		System.out.println("size : " + size);

		boolean contains = set.contains(e2);
		System.out.println("set contains e2 = " + contains);

		SetEx ex = new SetEx();
		ex.print(set);

		boolean removed = set.remove(e2);
		System.out.println("removed = " + removed);
		ex.print(set);

		/*
		 * boolean same = e1==e2; System.out.println("e1 same e2 : "+same);
		 * 
		 * boolean equals = e1.equals(e2); System.out.println("e1 equals e2 : "+equals);
		 * 
		 * 
		 * String s1 = new String ("hello"); String s2 = new String ("hello"); boolean
		 * equal = s1.equals(s2); System.out.println("s1 equals s2 : "+equal);
		 * System.out.println("hashcode : "+ s1.hashCode());
		 * System.out.println("hashcode : "+ s2.hashCode());
		 */

	}

	public void print(Set<Employee> set) {
		for (Employee e : set) 
		{
			System.out.println(e.getId() + " " + e.getName());
		}
	}
}
