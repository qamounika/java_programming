package oops;
class A2
{
	protected int a2=25;
	protected void displayA2()
	{
		System.out.println("displaying the value of a2 is-->"+a2);
	}
}

public class Protected {
	public static void main(String args[])
	{
		A2 obj =new A2();
		System.out.println(obj.a2);
		obj.displayA2();
	}
}
