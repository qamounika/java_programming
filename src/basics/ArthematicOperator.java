package basics;

public class ArthematicOperator {
	
	public int sum(int a, int b)
	{
		int result=a+b;
		return result;
	}
	public int subtract(int a,int b)
	{
		int result=a-b;
		return result;
	}
	public int mul(int a, int b)
	{
		int result =a*b;
		return result;
	}
	public int div(int a,int b)
	{
		int result=a%b;
		return result;
	}
     	
	public static void main(String args[])
	{
		ArthematicOperator obj=new ArthematicOperator();
		int result=obj.sum(14,12);
		 System.out.println(result);
	     result=obj.subtract(14, 12);
	     System.out.println(result);
	     result=obj.mul(14, 12);
	     System.out.println(result);
	     result=obj.div(14,12);
	     System.out.println(result);
		
		
		
	}
}
