package prabu.prgms.sample;

public class Sortarrayasc {
	
	public static void ascSort()
	{
		int[] a = new int[]{2,6,7,9,1,0};
		int[] b = new int[a.length];
		for(int i=0; i<=a.length-1;i++)
		{
			int n = 0;
			for(int j=0; j<=a.length-1; j++)
			{
				if(a[i]>a[j]){
					n++;
				}
			}
			b[n]=a[i];
		}
		
		for(int k=0;k<=b.length-1; k++)
		{
			System.out.println(b[k]);
		}
	}

	public static void main(String[] args) {
		ascSort();

	}

}
