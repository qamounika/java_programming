package basics;

public class FactorialUsingClass {
	int result=1;
	
	public void Factorial(int factorialNumber)
	{
		int i=1;
		int factorialResult=1;
		for(i=1;i<=factorialNumber;i++)
		{
			factorialResult=factorialResult*i;
		}
		System.out.println(" the factorial result is"+factorialResult);
	}
	public static void main(String args[])
	{
		FactorialUsingClass obj1=new FactorialUsingClass();
		obj1.Factorial(5);
		
		FactorialUsingClass obj2=new FactorialUsingClass();
		obj2.Factorial(2);
	}
	}
		
	