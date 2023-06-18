package oops;
// method overloading with different data types

class Addition
{
	void add(int a,int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	void add(double a,double b)
	{
		double result=a+b;
		System.out.println(result);
	}
}

public class MethodOverLoadingEx {
	public static void main(String args[])
	{
		Addition obj1=new Addition();
		obj1.add(3, 7);
		obj1.add(12.1, 14.1);
		
	}

}
