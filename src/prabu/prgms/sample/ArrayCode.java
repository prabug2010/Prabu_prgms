package prabu.prgms.sample;

import java.io.Serializable;
import java.util.Scanner;

public class ArrayCode {
	private static Scanner str;

	public static void largesmallno() {
		int[] numbers = new int[] { 10, 15, 20, 25, 7, 9, 22, 27 };
		int small = numbers[0];
		int large = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > large)
				large = numbers[i];
			else if (numbers[i] < small)
				small = numbers[i];
		}
		System.out.println("The largest number is :" + large);
		System.out.println("The smallest number is :" + small);
	}

	public class Exm implements Serializable {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public static void strrev()

	{
		String a;
		String b = "";
		System.out.println("Enter the input string :");
		str = new Scanner(System.in);
		a = str.nextLine();
		int x = a.length();
		for (int i = x; i >= 0; i--) {
			b = b + charAt(i);
		}

		System.out.println("The reversed string is : " + b);

	}

	private static String charAt(int i) {

		return null;
	}

	public static void revstr() {
		String stn = "india";
		int y = stn.length();
		for (int i = y - 1; i >= 0; i--) {
			System.out.println(stn.charAt(i));
		}
	}

	public static void arrcomp() {
		int[] a = new int[] { 4, 5, 7, 8, 2 };
		int[] b = new int[] { 3, 9, 7, 6, 11, 12, 5, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					System.out.println("The common numbers are: " + a[i]);
			}
		}
	}

	public static void main(String[] args) {
		// largesmallno();
		// strrev();
		// revstr();
		arrcomp();

	}

}
