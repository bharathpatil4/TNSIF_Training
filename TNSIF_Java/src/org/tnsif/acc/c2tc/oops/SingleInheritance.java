package org.tnsif.acc.c2tc.oops;

class Course{
	String courseName="java programming";
	void showCourse()
	{
		System.out.println("Course ;" + courseName );
	}
}
class Student extends Course{
	String stdName ="Bharath patil";
	void showStudent(){
		System.out.println("student :" + stdName);
	}
}

public class SingleInheritance {

	public static void main(String[] args) { 
		Student student =new Student();
		student.showStudent();
		
	}

}
