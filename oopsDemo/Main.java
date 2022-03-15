package oopsDemo;

public class Main {

	public static void main(String[] args) {
		Course c1=new Course(25,"java",60,85000.00);
		Course c2=new Course(32,"ms.net",80,65000.00);
		Student s1=new Student(123,"pavan",c1);
		Student s2=new Student(165,"adi",c2);
		Student s3=new Student(569,"naman",c1);
		s1.display();
		s2.display();
		s3.display();
		System.out.println(s1 instanceof Student);
		System.out.println(c1 instanceof Course);
	}

}
