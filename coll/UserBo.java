package coll;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserBo {
	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception
	{
		for(User u:userList)
		{
			bw.write(u.getName()+","+u.getMobileNumber()+","+u.getUsername()+","+u.getPassword()+"\n");
		}
	}
}
