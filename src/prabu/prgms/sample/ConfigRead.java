package prabu.prgms.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ConfigRead {
	public static void main(String[] args) {
		FileReader file = null;
		try {
			file = new FileReader("testconfig.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(prop.getProperty("id1"));
		System.out.println(prop.getProperty("id2"));
		System.out.println(prop.getProperty("name1"));
		System.out.println(prop.getProperty("name2"));
		System.out.println(prop.getProperty("name3"));
	}

}
