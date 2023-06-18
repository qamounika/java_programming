package oops;

//Here vehicleName and price are instance variables and its value is dependent on the objects we create for that class
//whereas vehicleType is static variable which means that its value is unique for all the complete class irrespective of the objects we create for the class
//We can access a static variable using classname.variablename (because static variable are class level variables)

class VehicleDetails1
{
	String VehicleName;
	int Price;
	static String VehicleType;
	void displayData()
	{
		System.out.println("VehicleName"+":"+"Price"+":"+VehicleType);
	}
	static void displayData1(VehicleDetails1 obj)
	{
		
		System.out.println("inside a static method");
		System.out.println(obj.VehicleName+":"+obj.Price+":"+ VehicleType);
		System.out.println(VehicleType);
	}
}

public class StaticMethodEx {
	public static void main(String args[])
	{
		VehicleDetails1 obj1=new VehicleDetails1();
		obj1.VehicleName="Yamaha";
		obj1.Price=90000;
		
		
		VehicleDetails1 obj2=new VehicleDetails1();
		obj2.VehicleName="Honda";
		obj2.Price=85000;
		
		VehicleDetails1.VehicleType="6 wheeler";
		obj1.displayData();
		obj2.displayData();
		VehicleDetails1.displayData1(obj1);
	}

}
