package ios;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Sturesult {

	public static void main(String[] args) throws Exception {
		System.out.println("enter name of students ");
		FileOutputStream fos=new FileOutputStream("result.txt");
		DataInputStream dis=new DataInputStream(System.in);
		int ch;
		while((ch=dis.read())!='$')
		{
			fos.write((char)ch);
		}
		fos.close();
		dis.close();

	}

}
