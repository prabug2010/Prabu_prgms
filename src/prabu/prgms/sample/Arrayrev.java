package prabu.prgms.sample;

public class Arrayrev {

	public static void Arrayrev()
	{
		int[] x = new int[] {4,8,5,9,6,0};
		int temp = 0;
		for (int i = x.length-1; i>=0; i--)
		{
			for (int j=i; j>=0;j--)
			{
					temp = x[j];
					x[j]=x[i];
					x[i]=temp;
				
					
			}
		}
		for(int y=0; y<x.length; y++)
		{
			System.out.println(x[y]);
		}
	}
	
	public static void Arrayrev1()
	{
		int[] x = new int[] {4,8,5,9,6,0};
		int temp = 0;
		for (int i = x.length-1; i>=0; i--)
		{
					temp = x[i];
					System.out.print(temp+" ");	
		}
		
			}
	
	public static void main(String args[])
	{
		//Arrayrev();
		Arrayrev1();
	}
}
