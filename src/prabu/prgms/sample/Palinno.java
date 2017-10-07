package prabu.prgms.sample;

public class Palinno {

	private static void Palinno()
	{
		int n = 155;
		int m=0;
		int temp, sum;
		temp = n;
		
		while(n>0)
		{
			sum = n%10;
			m=(m*10)+sum;
			n = n/10;
		}
		if(temp==m)
		{
			System.out.println("The given no is palindrome");
		}
		else
		{
			System.out.println("The given no is not a palindrome");
		}
		System.out.println("The reversed number is "+m);
	}
	
	public static void main(String args[])
	{
		Palinno();
	}
}
