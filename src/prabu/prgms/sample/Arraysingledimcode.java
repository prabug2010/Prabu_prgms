package prabu.prgms.sample;

public class Arraysingledimcode {

	public static void stringcc()
	{
		String[] a = new String[5];
		a[0]="p";
		a[1]="r";
		a[2]="a";
		a[3]="b";
		a[4]="u";
		String b = "";
		for (int i=0; i<a.length; i++)
		{
			b += a[i];
			
		}
		System.out.println("The concatenated string is " +b);
		//char ch = b.charAt(4);
		//System.out.println(ch);
	}
	public static void arrrev()
	{
		String[] a = new String[5];
		a[0]="p";
		a[1]="r";
		a[2]="a";
		a[3]="b";
		a[4]="u";
		String b = "";
		String c = "";
		for (int i=0; i<a.length; i++)
		{
			b += a[i];
					}
		System.out.println("The concatenated string is " +b);
		for (int j=a.length-1; j>=0; j--)
		{
			c += a[j];
			
		}
		System.out.println("The concatenated reverse string is " +c);
	}
	
	public static void main(String[] args) {
		//stringcc();
		arrrev();
	}

}
