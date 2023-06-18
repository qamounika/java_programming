package oops;

class A
{
	private int a;
		private void display()
		{
			System.out.println("Displaying the value of a-->"+a);
		}
		
	}

public class Package {
	public static void main(String args[]) {
		A obj=new A();
		/*
		 //compile time error
		   system.out.println(obj.a)
		   obj.display()
		 */
		
		A1 obj1=new A1();
		System.out.println(obj1.a1);
		obj1.displayA1();
		
	}
	

}
     // accesing a default method and variable


       