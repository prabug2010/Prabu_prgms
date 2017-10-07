package prabu.prgms.sample;

public class Arithmetic {

		public void addition()
		{
			int a=8;
			int b=a+7;
			int c=a+b;
		System.out.println("the sum is :"+c);
		}

		public void substraction()
		{
			int a=8;
			int b=a-7;
			int c=a-b;
		System.out.println("the difference is :"+c);
		}
		
		
		public static void main(String args[])
		{
		Arithmetic obj=new Arithmetic();
			obj.addition();
			Arithmetic obj1=new Arithmetic();
			obj1.substraction();
		}
		
	}


