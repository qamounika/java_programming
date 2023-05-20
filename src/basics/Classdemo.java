package basics;

public class Classdemo {

	public void addTwoNumbers(int a,int b)
	{
		int result=a+b;
		System.out.println("Additing of two numbers is"+result);
				
	}
	public static void main(String args[])
	{
		Classdemo obj1=new Classdemo();
		obj1.addTwoNumbers(10,8);
		
	}
}
