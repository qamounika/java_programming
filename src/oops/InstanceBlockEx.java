package oops;
class VehicleDetails10
{
	int VehicleSpeed;
	VehicleDetails10()
	{
		System.out.println("inside constructor");
		System.out.println("VehicleSpeed"+VehicleSpeed);
	}
	//instance block would be created inside the class but outside of any method
	{
		VehicleSpeed=120;
		System.out.println("inside instance block");
	}
	//static block
	static
	{
		System.out.println("inside static block");
	}
}

public class InstanceBlockEx {

	public static void main(String[] args) {
		VehicleDetails10 obj=new VehicleDetails10();
		VehicleDetails10 obj1=new VehicleDetails10();
		

	}

}
