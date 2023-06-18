package oops;
class Bike2
{
	void brake()
	{
		System.out.println("brake applied successfully");
	}
	void accelerate()
	{
		System.out.println("acceleration is good in this bike");
	}
}

public class ThisClassMethod {
	public static void main(String args[])
	{
		Bike2 obj=new Bike2();
		obj.accelerate();
		obj.brake();
	}

}
