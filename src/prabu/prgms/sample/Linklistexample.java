package prabu.prgms.sample;

import java.util.LinkedList;

class Employees
{
	int id;
	String name, managername;
	public Employees (int id, String name, String managername)
	{
		this.id = id;
		this.name = name;
		this.managername = managername;
	}
	
}

public class Linklistexample {

		
	
	public static void main(String args[])
	{
		LinkedList<Employees> l1 = new LinkedList<Employees> ();
		
		Employees e1 = new Employees (5472, "Prabu", "Sukhjeet");
		Employees e2 = new Employees (2922, "Murali", "Bala");
		l1.add(e1);
		l1.add(e2);
		
		for(Employees e : l1)
		{
			System.out.println(e.id+", "+e.name+", "+e.managername);
		}
		
	}

}
