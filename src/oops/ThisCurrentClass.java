package oops;
//local variable are variables declared inside the methods or constructor
//instance variables are variables that are declared inside the class but outside of all the methods. Moreover instance variables have default values assigned.
//With instance variables, you can specify different access modifiers like public, private, protected and default

//when there is same variable name for both instance and local variables, then the compiler could get confused and print its default values.c

class Student
{
	int rollNo;
	String name;
	int marks;
	Student(int rollNo,String name,int marks)
	{
		rollNo=rollNo;
		name=name;
		marks=marks;
	}
 void displayStudentData(){
	 String course="computer science";
	 System.out.println("the student roll no is"+rollNo+"and his name and marks are"+name+" "+marks);
	 System.out.println("the course name"+course);
 }
}

public class ThisCurrentClass {
	public static void main(String args[])
	{
		Student obj=new Student(9,"jai",85);
		obj.displayStudentData();
		//course variable is a local variable and so its scope is limited within its method (displayStudentData)
				//System.out.println("The course name is "+course);

	}

}
