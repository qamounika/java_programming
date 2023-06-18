package oops;
class Bank
{
	void interest()
	{
		System.out.println("Interest rate is7");
	}
	
}
class HDFC extends Bank
{
	void interest()
	{
		System.out.println("Interesrt rate is 8");
	}
}
class ICICI extends Bank
{
	void interest()
	{
		System.out.println("Interesrt rate is 9");
	}
}

public class MethodOverridingEx {
	public static void main(String args[])
	{
		HDFC obj=new HDFC();
		obj.interest();
		ICICI obj1=new ICICI();
		obj1.interest();
	}

}
