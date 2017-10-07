package prabu.prgms.sample;

public class ArrayMerExam {
	
	public static void Arraymerexam()
	{
		int[] a1 = new int[] {23, 25, 26, 50};
		int[] a2 = new int[] {26, 50, 22, 19};
		int[] a3 =new int[a1.length+a2.length];
		for(int x=0; x<a1.length;x++)
		{
			a3[x]=a1[x];
		}
		int count =a1.length;
		for(int i=0; i<a2.length; i++)
		{
			boolean add = true;
			for(int j=0; j<a1.length; j++)
			{
				if(a2[i]==a1[j])
				{
					add = false;
					break;
				}
			}
			if(add)
			{
				a3[count]=a2[i];
				count = count+1;
			}
		}
		
		for(int y=0; y<a3.length;y++)
		{
			System.out.println(a3[y]);
		}
	}
	
	public static void main(String args[])
	{
		Arraymerexam();
	}

}
