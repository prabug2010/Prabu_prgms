package prabu.prgms.sample;

public class Palindrome {

	public static void palin()
	{
		String[] a = new String[5];
		String m = "";
		String b = "";
		a[0]="l";
		a[1]="i";
		a[2]="r";
		a[3]="i";
		a[4]="l";
		
		for(int i = a.length-1; i >= 0; i--)
		{
			m += a[i];
		}
		
		for(int j = 0; j <a.length-1; j++)
		{
			b += a[j];
		}
		
		if(b==m)
		{
		System.out.println("The given string is palindrome");
	}
		else{
			System.out.println("The given string is palindrome");
		}
		}
	public static void main(String args[])
	{
		palin();
	}
}
