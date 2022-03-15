package oops;

public class StudentInfoDemo {

	public static void main(String[] args) {
		
		Address a1=new Address("3-90","hyd","ts",500045);
		Address a2=new Address("8=9-75","vjz","ap",508906);
		Student s1=new Student(123,"sai",a1);
		Student s2=new Student(456,"ajay",a2);
		s1.display();
		s2.display();
	}

}
