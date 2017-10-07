package prabu.prgms.sample;

public class Stringexamples {

	public static void Stringexamples()
	{
		String st1 = "String sample coding";
		String st2 = "String Sample Coding";
		System.out.println(st1.endsWith("g"));
		System.out.println(st1.indexOf('c'));
		System.out.println(st2.contains("sample"));
		System.out.println(st1.startsWith("S"));
		System.out.println(st1.equalsIgnoreCase(st2));
		}
	
	public static void main(String args[])
	{
		Stringexamples();
		String a = String.join("-","Java","is","a","programming","language");
		System.out.println(a);
	}
}
