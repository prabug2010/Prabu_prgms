package prabu.prgms.sample;

import java.io.File;
import java.io.IOException;

public class WindowsFile implements IInterface {

	@Override
	public void write() {
		
		try {

		      File file = new File("E:\\newfile2.txt");

		      if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }

	    	} catch (IOException e) {
		      e.printStackTrace();
		}
	}
	@Override
	public void read() {
		
		File f = new File("G:/Workspace/newFile2.txt");
		if(f.exists())
		{
			System.out.println("File is created already");
		}
	}
}