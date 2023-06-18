package oops;

class A1
{
	int a1=11;
	void displayA1()
	{
		System.out.println("displaying a numberof A1 is-->"+a1);
	}
}

public class Default {
	public static void main(String args[])
	{
		A1 obj=new A1();
		System.out.println(obj.a1);
		obj.displayA1();		
	}

}
