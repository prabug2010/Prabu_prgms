package prabu.prgms.sample;

public class Factrecursion {
	
	public static int fact(int n)
	{
		if(n==0)
		return 1;
		else
			return (n*fact(n-1));
		}

	public static void main(String args[]){
		int i, factorial =1;
		int m = 3;
		factorial = fact(m);
		System.out.println("The factorial of given number is "+factorial);
	}
}
