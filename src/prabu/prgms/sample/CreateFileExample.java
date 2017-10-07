package prabu.prgms.sample;

import java.io.File;

public class CreateFileExample {
	public static void main(String[] args) {
		try {

			File file = new File("E:\\newfile.txt");

			if (file.exists()) {
				System.out.println("File already exists.");
			} else {
				file.createNewFile();
				System.out.println("File is created!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}