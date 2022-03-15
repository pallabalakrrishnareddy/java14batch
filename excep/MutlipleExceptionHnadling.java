package excep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MutlipleExceptionHnadling {

	public static void main(String[] args)  {
	FileInputStream fis=null;
	try {
		fis = new FileInputStream("C://Users//balakrishna.palla//OneDrive - HCL Technologies Ltd//Desktop//myinfo.txt");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	int ch;
	try {
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
			Thread.sleep(300);
		}
	} catch (IOException ie) {
			ie.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
