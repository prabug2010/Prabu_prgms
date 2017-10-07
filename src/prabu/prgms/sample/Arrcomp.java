package prabu.prgms.sample;

public class Arrcomp {

	public static void Arrcomp()
	{
		int[] a = new int[] {12,15,16,17,10,11};
		int[] b = new int[] {15,16,14,13,11,10};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("The common values are : "+a[i]);
				}
			}
		}
	}
	
	public static void Strcomp()
	{
		String[] a = new String[] {"is","was","and","on","under"};
		String[] b = new String[] {"over","was","is","about","on"};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("The common strings are : "+a[i]);
				}
			}
		}
	}
	public static void main(String args[])
	{
		Arrcomp();
		Strcomp();
	}
}
