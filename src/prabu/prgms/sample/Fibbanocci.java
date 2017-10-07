package prabu.prgms.sample;

import java.util.Scanner;

public class Fibbanocci {

	public static void Fibbanocci()
	{
		int a=0, b = 1;
		int c;
		System.out.print(a+" "+b);
		int x = 8;
		
	for (int i =0; i<x; i++)
	{
		c = a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
	
	}
	
		public static void main(String args[])
		{
			Fibbanocci();
		}
}
