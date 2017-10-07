package prabu.prgms.sample;

public class Factorial {

	public static void fact()
	{
		int fact = 1;
		int n=6;
		for(int i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("The factorial of given number is "+fact);
	}
	
	public static void main(String args[])
	{
		fact();
	}
}
