package oops;
//Here vehicleName and price are instance variables and its value is dependent on the objects we create for that class
//whereas vehicleType is static variable which means that its value is unique for all the complete class irrespective of the objects we create for the class
//We can access a static variable using classname.variablename (because static variable are class level variables)

class VehicleDetails
{
	int price;
	String VehicleName;
	static String VehicleType;
	void displayData()
	{
		System.out.println("VehicleName"+":"+price+":"+VehicleType);
	}
}

public class StaticVarEx {
	public static void main(String args[])
	{
		VehicleDetails obj1=new VehicleDetails();
		obj1.VehicleName="Yamaha ray";
		obj1.price=90000;
		//obj1.vehicleType="2 Wheeler";
	
		VehicleDetails obj2=new VehicleDetails();
		obj2.VehicleName="Honda";
		obj2.price=80000;
		//obj2.vehicleType="4 Wheeler";
	
		VehicleDetails.VehicleType="6 wheeler";
		//VehicleDetails.vehicleType="6 wheeler";
		obj1.displayData();
		obj2.displayData();
		
	}

}
