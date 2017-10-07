package prabu.prgms.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Arrlist {
	
	public static void arrlist()
	{
		ArrayList arr1 = new ArrayList();
		arr1.add("one");
		arr1.add("two");
		arr1.add("three");
		arr1.add(0,"zero");
		arr1.set(1, "two2");
		
		for(int i=0; i<arr1.size(); i++)
		{
			System.out.println(arr1.get(i));
		}
	}

	
	public static void arrlist1()
	{
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("one");
		arr2.add("two");
		arr2.add("three");
		arr2.add(2,"zero");
		
		Vector<String> v = new Vector<String>();
		v.add("two");
		v.add("four");
		
		
		ArrayList<String> q5 = new ArrayList<String>();
		q5.add("");
		q5.add("");
		q5.add("");
		q5.add("");
		
		String s = arr2.get(2);
		System.out.println(s);
		
		
		
		Collections.copy(q5, arr2);
		System.out.println(q5);
		arr2.addAll(3,v);
		
		Iterator it1 = arr2.iterator();
		
		while(it1.hasNext())
			System.out.println(it1.next());
			
	}
	
	public static void arrlist2()
	{
		ArrayList arr3 = new ArrayList();
		arr3.add("one");
		arr3.add("two");
		arr3.add("three");
		arr3.add(0,"zero");
		arr3.set(1, "two2");
			
	ListIterator itr = arr3.listIterator();
	
	while(itr.hasPrevious()){
		System.out.println(itr.previous());
	}	
	}
	
	public static void main(String args[])
	{
		arrlist1();
	//	arrlist2();
	//	arrlist();
	}
}
