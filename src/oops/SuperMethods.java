package oops;
// super class
class Car1
{
	String carColor="black";
	void displayColor()
	{
		System.out.println("the color of the car1 is-->"+carColor);
	}
}
// child class
class Maruthi extends Car1
{
	String carColor="red";
	void displayColor()
	{
		System.out.println("the color of the child car1 is-->"+carColor);
	}

	void getAllCarData()
	{
	     displayColor();
	     super.displayColor();
	}


}
