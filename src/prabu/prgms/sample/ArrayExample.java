package prabu.prgms.sample;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// arrayIterator();
		System.out.println("Please enter the total no of employees ");
		int numberOfEmployee;
		numberOfEmployee = new Scanner(System.in).nextInt();
		int[] idList = idGenerator(numberOfEmployee);
		System.out.println(idList.length);
	}

	public static void arrayIterator() {
		int[] id = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
	}

	public static int[] idGenerator(int a) {
		int[] idListGenerator = new int[a];
		for (int index = 0; index < a; index++) {
			idListGenerator[index] = index;
		}
		return idListGenerator;
	}

}
