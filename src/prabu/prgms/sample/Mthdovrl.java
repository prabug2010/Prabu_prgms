package prabu.prgms.sample;

public class Mthdovrl {

	public int add(int a, int b) {
		System.out.println("Two int parameter add method called");
		return a + b;
	}

	public int add(int a, int b, int c) {
		System.out.println("Three int parameter add method called");
		return a + b + c;
	}

	public double add(double a, double b) {
		System.out.println("Two double parameter add method called");
		return a + b;
	}

	public static void main(String[] args) {
		Mthdovrl mo = new Mthdovrl();
		mo.add(1, 2);
		mo.add(1, 2, 3);
		mo.add(2d, 5d);
	}
}
