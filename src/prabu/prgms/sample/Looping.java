package prabu.prgms.sample;

public class Looping {

	public static int i = 0;

	public static void main(String[] args) {

		for (int index = 0; index < 5; index++) {
			if (index == 2) {
				continue;
			}
			if(index == 4){
				break;
			}
			i = i + index;
			System.out.println("Index value is : " + index);
		}

		System.out.println("I value is : " + i);

		doWhileCondition();
		whileCondition();
	}

	public static void whileCondition() {
		int j = 0;
		while (j < 5) {
			System.out.println("J value is : " + j);
			j++;
		}
	}

	public static void doWhileCondition() {
		int j = 0;
		do {
			System.out.println("J value is : " + j);
			j++;
		} while (j > 5);
	}

}
