package oops;
class Car2
{
	Car2()
	{
		System.out.println("parent class constructor");
	}
	
}
class Hyundai extends Car2
{
	Hyundai()
	{
		super();
		System.out.println("child class constructor");
	}
	
}

public class SuperConstructor {
	public static void main(String args[])
	{
	Hyundai obj=new Hyundai();
	}

}
