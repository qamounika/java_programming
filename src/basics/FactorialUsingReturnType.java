package basics;

public class FactorialUsingReturnType {

	long factorialResult;
	public FactorialUsingReturnType()
	{
		factorialResult=1;
		System.out.println("Constructor is called when the object is created. It wwas the first method that will be executed");
	}
	public long factorial(int factorialNumber)
	{
		for(int i=1;i<=factorialNumber;i++)
		{
			factorialResult= factorialResult*i;
		}
		return factorialResult;
	}
	public static void main(String args[])
		{
			FactorialUsingReturnType obj1= new FactorialUsingReturnType();
			long result=obj1.factorial(5);
			System.out.println("The factorial value is "+result);
			
			FactorialUsingReturnType obj2= new FactorialUsingReturnType();
			long result1=obj2.factorial(25);
			System.out.println("The factorial value is "+result1);
}
	}
