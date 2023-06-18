package oops;
//Abstract class can have constructor and its variables can be final, static , non-final and non-static.

abstract class Shape
{
	Shape()
	{
		System.out.println("shape is a default constructor");
	}
	final int q=10;
	int b=20;
	static String name="java";
   abstract void draw();
}
class Rectangle extends Shape
	{
	//override
	void draw()
	{
		System.out.println("drawing an rectangle");
	}
		
	}	

class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing an circle");
	}
}

public class AbstractClassEx2 {
	public static void main(String args[])
	{
		Rectangle obj=new Rectangle();
		obj.draw();
		Circle obj1=new Circle();
		obj1.draw();
	}

}
