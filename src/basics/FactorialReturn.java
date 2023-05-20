package basics;

public class FactorialReturn {

int result=1;
	
	public int Factorial(int factorialNumber)
	{
		int i=1;
		int factorialResult=1;
		for(i=1;i<=factorialNumber;i++)
		{
			factorialResult=factorialResult*i;
		}
			return factorialResult;
		
	}
	public static void main(String args[])
	{
		FactorialReturn obj1=new FactorialReturn();
		int result=obj1.Factorial(5);
		System.out.println(result);
		
		FactorialReturn obj2=new FactorialReturn();
		int result1=obj2.Factorial(2);
		System.out.println(result1);
	}
	}

