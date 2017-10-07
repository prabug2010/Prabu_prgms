package prabu.prgms.sample;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	
	public static void hashset()
	{
		HashSet h = new HashSet();
		
		h.add(2);
		h.add(3);
		h.add(4);
		
		System.out.println("The hashset size before removing 2nd element : "+h.size());
		
		Iterator irr = h.iterator();
		while(irr.hasNext())
			System.out.println(irr.next());
		
		h.remove(2);
		System.out.println("The hashset size after removing 2nd element : "+h.size());
		boolean b = h.contains(2);
		System.out.println("The hashset contains element 2 : "+b);
	}

	public static void main(String args[])
	{
		hashset();
	}
}
