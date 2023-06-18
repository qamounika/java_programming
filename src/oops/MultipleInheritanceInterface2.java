package oops;
//We are going to see how to solve multiple inheritance problem through interface
interface car8
{
	void carBrake();
}

interface car9
{
	void carBrake();
}


public class MultipleInheritanceInterface2 implements car8,car9{
	@Override
	public void carBrake () {
		System.out.println("Changing the brake of the car");		
	}
	
	public static void main(String[] args) {

		MultipleInheritanceInterface2 obj = new MultipleInheritanceInterface2();
		obj.carBrake();
	}


}
