package oops;
class Car
{
	String carColor="black";
	
}
class Mahindra extends Car
{
	String carColor="red";
	void displayColor()
	{
	System.out.println(carColor);
	System.out.println(super.carColor);
	}
	
}

public class SuperKey {
	public static void main(String args[])
	{
	Mahindra mahindra=new Mahindra();
	mahindra.displayColor();
	}

}
