package prabu.prgms.sample;

public class Stringcompare {
	
	public static void stringcode1()
	{
		String s1 ="ÏNDIA";
		String s2 = new String("ÏNDIA");
		String s3 = "ÏNDIA";
		String s4 = "USA";
		String s5 = s2.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s3==s2);
		System.out.println(s1==s5);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s1));
		
	}
	
	public static void strings()
	{
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello") ;//Using constructor.
		 
		if(str1 == str2)
		        System.out.println("Equal 1");
		else
		        System.out.println("Not Equal 1");
		 
		if(str1 == str3)
		        System.out.println("Equal 2");
		else
		         System.out.println("I am constructed using constructor, hence not interned");
		 
		if( str1.equals(str3) )
		        System.out.println("Equal 3");
		else
		        System.out.println("Not Equal 3");
	}

	public static void main(String args[])
	{
		stringcode1();
		strings();
	}
}
