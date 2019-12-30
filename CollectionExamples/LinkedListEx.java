package CollectionExamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import rachanajava.IntegerComparator;

public class LinkedListEx {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(6);
		list.add(8);
		

		int firstelement = list.get(0);
		System.out.println("firstelement : " + firstelement);

		LinkedListEx a = new LinkedListEx();
		System.out.println("Linked List : ");
		a.print(list);
		list.remove(2);
		System.out.println("Linked List after removing : ");
		a.print(list);

		int size = list.size();
		System.out.println("Size : " + size);

		boolean isEmpty = list.isEmpty();
		System.out.println("isempty :" + isEmpty);

		boolean containsElement = list.contains(2);
		System.out.println("containselement :" + containsElement);

		System.out.println("Print by Iterator :");
		a.printByIterator(list);
		
		System.out.println("After Sorting : ");
		a.sort(list);
		a.print(list);

	}

	public void printByIterator(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			System.out.println("elements : " + num);
		}

	}

	public void print(List<Integer> list) {
		for (Integer e : list) {
			System.out.println(e);
		}

	}
	
	public void sort(List<Integer> list)
	{
		IntegerComparator comparator = new IntegerComparator();
		list.sort(comparator);
		
	}


}

