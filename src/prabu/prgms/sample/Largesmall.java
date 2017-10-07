package prabu.prgms.sample;

public class Largesmall {

	public static void Largesmall()
	{
		int[] n = new int[]{12,10,5,7,19,25};
		int l = n[0];
		int s = n[0];
		for (int i=0; i<n.length-1; i++)
		{
			 if(n[i]>l)
				 l = n[i];
			 else if(n[i]<s)
				 s = n[i];
			 }
		System.out.println("The largest no is :"+l);
		System.out.println("The smallest no is :"+s);
		}
	
	public static void main(String args[])
	{
		Largesmall();
	}
}
