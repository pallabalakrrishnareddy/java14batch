package ios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C://Users//balakrishna.palla//OneDrive - HCL Technologies Ltd//Desktop//TECHBEE_OND21_APPS_FS_JAVA_2//exceptions.txt");
int ch;
while((ch=fis.read())!=-1)
{
	System.out.print((char)ch);
	//Thread.sleep(50);
}
	}

}
