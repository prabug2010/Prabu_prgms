package prabu.prgms.sample;

public class Pyramid {

	private static void Pyramid()
	{
		int n = 5;
		for(int i=0; i<n; i++)
		{
			for(int j=0;j<=n-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	private static void Pyramidno()
	{
		int n = 5;
		for(int i=0; i<n; i++)
		{
			for(int j=0;j<=n-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String args[])
	{
		Pyramid();
		//Pyramidno();
	}
}
