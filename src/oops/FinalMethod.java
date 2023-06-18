package oops;
// when we add final keyword to the method .the method cannot be over rided in the subclass
class VehicleColor
{
	final void displayVehicleColor()
	{
		System.out.println("vehicle color is black");
	}
}

public class FinalMethod extends VehicleColor{
//void displayVehicleColr()
{
	System.out.println("vehice color is white");
}
public static void main(String args[])
{
	FinalMethod obj=new FinalMethod();
	obj.displayVehicleColor();
}

}
