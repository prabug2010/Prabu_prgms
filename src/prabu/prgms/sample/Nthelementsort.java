package prabu.prgms.sample;

public class Nthelementsort {

	public static void Nthelementsort()
	{
		int[] n = new int[] {5,8,9,3,0,4,1,6};
		int l = 5;
		int temp=0;
		for(int i =0; i<n.length;i++)
		{
			for(int j=0; j<n.length;j++)
			{
				if(n[i]<n[j])
				{
					temp=n[j];
					n[j]=n[i];
					n[i]=temp;
				}
			}
		}
		
		for(int x=0; x<n.length; x++)
		{
			System.out.println(n[x]);
		}
		System.out.println("The 5th smallest number is : "+n[l-1]);
	}
	
	public static void main(String args[])
	{
		Nthelementsort();
	}
}
