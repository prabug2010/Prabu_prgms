package prabu.prgms.sample;

public class Nonrptchar {
	public static void nonrpt()
	{
		String str = "Liril";
		int index = -1;
		char[] a = new char[str.length()];
		a = str.toCharArray();
		char[] count = new char[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			if (count[str.charAt(i)] == 1)
			{
				index = i;
				break;
			}
				
		}
		System.out.println("The first non repeating character is " +index);
	}
	
	public static void main(String args[])
	{
		nonrpt();
	}
	
}
