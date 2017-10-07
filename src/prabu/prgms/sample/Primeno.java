package prabu.prgms.sample;

import java.util.Scanner;

public class Primeno {

	public static void Primeno()
	{
		int y, z=0;
		System.out.println("Enter the number :");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		y = x/2;
		
		for(int i=2; i<y; i++)
		{
			if(x%i == 0)
			{
				System.out.println("The no is not a prime number");
				z = 1;
				break;
			}
			
		}
		if (z == 0) {
			System.out.println("The no is a prime number");
		}
		
	}

	public static void main(String args[])
	{
		Primeno();
	}
}
