package CollectionExamples;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Set;

import rachanajava.Employee;
import rachanajava.EmployeeKeyComparator;

public class MapEx {

	public static void main(String[] args)
	{
		
		//Map<Integer , Employee> map = new HashMap<>();
		Map<Integer , Employee> map = new TreeMap<>(new EmployeeKeyComparator());
		Employee e1 = new Employee(1 , "rachana");
		Employee e2 = new Employee(2 , "alekya");
	
		map.put(1, e1);
		map.put(2, e2);
		
		Employee fetched1 = map.get(1);
		Employee fetched2 = map.get(2);
	
		MapEx m = new MapEx();
		m.printByKeys(map);
		
		map.remove(1);
		System.out.println("After removing : ");
		m.printByKeys(map);
		m.printByEntries(map);
		m.printByValues(map);
		
	}
	
	
	
	public void printByEntries(Map<Integer , Employee> map)
	{
		Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
		for(Map.Entry<Integer, Employee> entry : entries)
		{
			int key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println(value.getName());	
		}
	}	
	
	
	
	public void printByValues(Map<Integer , Employee> map)
	{
		Collection<Employee> values = map.values();
		for(Employee e : values)
		{
			System.out.println(e.getName());
		}
	}
	
	
	
	public void printByKeys(Map<Integer , Employee> map)
	{
		Set<Integer> keys = map.keySet();
		for(int k : keys)
		{
			Employee value = map.get(k);
			System.out.println(value.getName());
		}
	}
}
