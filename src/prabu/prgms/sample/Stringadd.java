package prabu.prgms.sample;

public class Stringadd 
{
public static void strconcat1 ()
{

	String st1 = "Java";
	String st2 = "is a";
	StringBuffer st3 = new StringBuffer("programming language");
	StringBuffer st8 = new StringBuffer("programming language");
	String st4 = st1.concat(st2);
	st4=st4.concat("programming language");
	String st5 = st1+" "+"is a"+" "+st3;
	StringBuffer st6 = st3.append(" universal");
	StringBuffer st7 = st8.insert(0,"universal ");
	System.out.println("concated string without space : "+st4);
	System.out.println("concated string with space : "+st5);
	System.out.println(st6);
	System.out.println(st7);
	char c1 = st1.charAt(2);
	System.out.println(c1);
	System.out.println(st5.substring(15));
	System.out.println(st5.substring(0,15));
	String st10 = st1.replace('a', 'e');
	System.out.println(st10);
	}
public static void split()
{
	String s = "Ï-Love-Amma";
	String[] t = s.split("-");
	for(String x:t){
		System.out.println(x);
	}
}
 
public static void main(String args[])
{  
split(); 
//strconcat1();
}
}  