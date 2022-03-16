import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.EmployeeDao;
import com.spring.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enteremp sap id,ename,sal");
		int sapid=sc.nextInt();
		String ename=sc.next();
		double sal=sc.nextDouble();
		ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao e=(EmployeeDao) c.getBean("e1");
		e.insert(new Employee(sapid,ename,sal));
System.out.println("data inserted");
	}

}
