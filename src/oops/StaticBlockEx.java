package oops;
class VehicleDetails2
{
	String VehicleName="scooty";
	int Price=9000;
	static String VehicleType;
	
	VehicleDetails2()
	{
		System.out.println("Inside the constructor");
	}
	
	void displayData()
	{
		System.out.println("inside not static method");
		System.out.println(VehicleName+":"+Price+":"+VehicleType);
	}
	//we use use static block to initialize static variables
	static
	{
		System.out.println("inside");
		System.out.println("inside static block");
		VehicleType="2-wheeler";
	}
}

public class StaticBlockEx {
	public static void main(String args[])
	{
		VehicleDetails2 obj=new VehicleDetails2();
		obj.displayData();
	}

}
