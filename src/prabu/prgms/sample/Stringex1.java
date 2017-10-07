package prabu.prgms.sample;

public class Stringex1 {

	public static void Stringex1()
	{
	 String str = "java coding is easy";
	 String[] sts = str.split("//s");
	 String d = "";
	 for (String b : sts)
	 {
		 String x = b.substring(0,1);
		 String c = b.substring(1);
		 d += x.toUpperCase()+c+"";
	 }
	 
	 System.out.println(d);
	}
	
	public static void main(String args[])
	{
		Stringex1();
	}
}
