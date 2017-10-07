package prabu.prgms.sample;

public class Revno {

	public static void revno()
	{
		int n = 1356;
		int m =0;
		int temp=0;
		int sum=0;
		
		while(n>0){
			sum=n%10;
			m=(m/10)+sum;
			temp = n/10;
		}
		System.out.println("The reversed number is "+m);
	}
	public static void main(String args[])
	{
		revno();
	}
}
