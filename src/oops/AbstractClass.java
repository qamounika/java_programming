package oops;
//Abstract class can have both abstract and non-abstract methods
//we cannot create object for an abstract class instead we cant create object for its implementing class(AbstractClassEx)

abstract class Bike10
{
	//if we are not defining a (writing logic)method;then that becomes an abstract method
	abstract void gear();
	void accelerate()
	{
		System.out.println("accelerating the bike");
	}
}
abstract class Bike11 extends Bike10
{
	abstract void refuel();
		void changeColor()
		{
			System.out.println("Changing the color of bike");
		}
	
}

public class AbstractClass extends Bike11 {
	void gear()
	{
		System.out.println("changing the gear");
	}
	//override
	void refuel()
	{
		System.out.println("Refuel");
	}
	public static void main(String args[])
	{
		AbstractClass obj=new AbstractClass();
		obj.accelerate();
		obj.gear();
		obj.refuel();
		obj.changeColor();
		//cannot create object or instance to an abstract class(Bike10)
		//Bike10 obj1= new Bike10();
	}

}
