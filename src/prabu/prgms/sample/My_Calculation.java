package prabu.prgms.sample;
class Calculation {
   int z;
	
   public void addition(int x, int y, int w) {
      z = x + y+ w;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}

public class My_Calculation extends Calculation {
   public void multiplication(int x, int y, int w) {
      z = x * y * w;
      System.out.println("The product of the given numbers:"+z);
   }
   
   public void division(int x, int y)
   {
	   z = x/y;
	   System.out.println("The quotient of the given numbers:"+z); 
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10; 
      int c =5;
      My_Calculation demo = new My_Calculation();
      demo.addition(a, b, c);
      demo.Subtraction(a, b);
      demo.multiplication(a, b, c);
      demo.division(a, b);
   }
}