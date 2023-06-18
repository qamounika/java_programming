package oops;
class Car5
{
	Car5()
	{
		System.out.println("this  is a default constructor");
	}
	Car5 (String name)
	{
		System.out.println("the car name is"+name);
	}
}

public class TheCurrentClassConstructor {
	public static void main(String args[])
	{
		Car5 obj=new Car5("Mahindra XUV 700");
	}

}
