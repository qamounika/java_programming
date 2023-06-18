package basics;

public class ArthematicOperators {

	public void Arthematic(int a,int b)
	{
		int sum=a+b;
		int subtract =a-b;
		int multiply=a*b;
		int div=a%b;
		System.out.println(sum);
		System.out.println(subtract);
		System.out.println(multiply);
		System.out.println(div);

	}
	public static void main(String args[])
	{
		ArthematicOperators obj1= new ArthematicOperators();
		obj1.Arthematic(14,12);
		
	}
}
