package ios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("saifriendsinfo.txt");
		DataInputStream dis=new DataInputStream(System.in);
		BufferedInputStream bis=new BufferedInputStream(dis);
		System.out.println("enter u friend name");
		System.out.println("to quit press $");
		int ch;
		while((ch=bis.read())!='$')
		{
			//System.out.print((char)ch);
			fos.write((char)ch);
		}
	}

}
