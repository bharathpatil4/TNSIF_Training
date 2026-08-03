package org.tnsif.acc.c2tc.polymorphism; 
class Student
{
	String name;
	int age;
	
	Student()
	{
		System.out.println("Default constructor");
	}
	Student(String name)
	{
		this.name=name;
		System.out.println("Name :"+name);
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name :"+ name +"   Age :"+age);	 
	}	
} 

public class ConstructorOverloadind {

	public static void main(String[] args) { 
		Student std1 =new Student();
		Student std2 = new Student("Patil");
		Student std3 = new Student("Patil",21);

	}

}
