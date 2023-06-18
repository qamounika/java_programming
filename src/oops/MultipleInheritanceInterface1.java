package oops;
//We are going to see how to solve multiple inheritance problem through interface
interface car7
{
	String color="black";
	void carColor();
}
interface car6
{
	void carBrake();
}

public class MultipleInheritanceInterface1 implements car7,car6{
	@Override
	public void carBrake()
	{
		System.out.println("Color of the car is "+color);
	}
	@Override
	public void carColor() {
		// TODO Auto-generated method stub
		System.out.println("Color of the car is "+color);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInheritanceInterface1	obj= new MultipleInheritanceInterface1();
		obj.carBrake();
		obj.carColor();
}
}
