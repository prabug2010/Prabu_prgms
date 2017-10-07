package prabu.prgms.sample;

public class Finallyexc {

	public static void main(String args[]) throws Exception{
		new Finallyexc().process();
	}

	public void process() throws ArithmeticException{
			a();
	}

	public void a() throws ArithmeticException{
		int data = 25 / 0;
		System.out.println(data);
		System.out.println("rest of the code...");
	}
}
