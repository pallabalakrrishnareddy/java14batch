package ios;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		File f1=new File("hclStuInfo.doc");
		if(f1.createNewFile())
		{
			System.out.println("new file is created");
		}
		else
		{
			System.out.println("file is already avl");
		}
	}

}
