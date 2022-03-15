package oopsDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateInfoDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		System.out.printf("%1$tA %1$tb %1$td",d);
		System.out.println();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(d));
		SimpleDateFormat sdf1=new SimpleDateFormat("D-MM-yyyy");
		System.out.println(sdf1.format(d));
	}

}
