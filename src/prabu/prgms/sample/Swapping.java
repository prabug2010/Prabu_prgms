package prabu.prgms.sample;

public class Swapping {

	public static void swap()
	{
		int n1, n2;
		n1 = 10;
		n2 = 20;
		System.out.println("Before swapping :");
		System.out.println("Value of first number :" +n1);
		System.out.println("Value of second number :" +n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping :");
		System.out.println("Value of first number :" +n1);
		System.out.println("Value of second number :" +n2);
	}
  public static void main(String args[])
  {
	  swap();
  }
}

