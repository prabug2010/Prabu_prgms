package prabu.prgms.sample;

public class Oopssample {
	public static void main(String[] args) {
		IInterface fileReadWrite;
		String value = System.getProperty("os.name");
		if (value.contains("Windows")) {
			fileReadWrite = new WindowsFile();
		} else {
			fileReadWrite = new LinuxFile();
		}
		fileReadWrite.read();
		fileReadWrite.write();
	}
}