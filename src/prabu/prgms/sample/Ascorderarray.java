package prabu.prgms.sample;

public class Ascorderarray {
	
	public static void Ascorderarray()
	{
		int[] x = new int[] {4,8,5,9,6,0};
		int temp = 0;
		for (int i = 0; i<x.length; i++)
		{
			for (int j=i; j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					temp = x[j];
					x[j]=x[i];
					x[i]=temp;
				}
					
			}
		}
		for(int y=0; y<x.length; y++)
		{
			System.out.println(x[y]);
		}
	}
	
	public static void main(String args[])
	{
		Ascorderarray();
	}

}
