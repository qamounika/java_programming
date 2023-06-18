package oops;

public class ProtectedEx1 {
	
	protected int val=10;
	protected void displayval()
	{
		System.out.println("the value is-->"+val);
	}
	public static void main(String args[])
	{
		ProtectedEx1 obj=new ProtectedEx1();
		obj.displayval();
	}
	

}
