package prabu.prgms.sample;

import java.util.LinkedList;

public class Linkedlist {

	public static void linklist()
	{
		LinkedList list = new LinkedList();
		list.add(2);
		list.add("a");
		list.add('b');
		list.add(2);
		
		
		System.out.println("The list contains : "+list);
		
		list.addFirst(1);
		
		System.out.println("The list after adding element at first : "+list);
		
		list.addLast(3);
		
		System.out.println("The list after adding element at last : "+list);
	}
	
		
	public static void main(String args[])
	{
		 linklist();
	}
}
