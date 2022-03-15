package ios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamDemo {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		BufferedInputStream bis=new BufferedInputStream(dis);
		System.out.println("enter u friend name");
		System.out.println("to quit press $");
		int ch;
		while((ch=bis.read())!='$')
		{
			System.out.print((char)ch);
		}
	}

}
