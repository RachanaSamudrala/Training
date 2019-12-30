package CollectionExamples;

import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);

		Object o = list.get(0);
		int firstelement = (int) o;
		System.out.println("firstelement : " + firstelement);

		ArrayListEx a = new ArrayListEx();
		a.print(list);
		list.remove(2);
		System.out.println("Array List : ");
		a.print(list);

	}

	public void print(List list) {
		for (Object e : list) {
			int num = (int) e;
			System.out.println(num);
		}

	}
}
