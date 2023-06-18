package oops;
// polymorphism-->manyforms
//under that we have 1.method overloading 2.method overriding
//method overloading  or compile time polymorphism
// if the class has same method names but difference in the no.of arguments or return type.it is called method over loading
class Arthematic
{
	void add(int a,int b)
	{
		int result=a+b;	
		System.out.println("addition of twp numbers-->"+result);
	}
	void add(int a,int b, int c)
	{
		int result=a+b+c;
		System.out.println("addition of three numbers-->"+result);
	}
}

public class MethodOverLoading {
	public static void main(String args[])
	{
		Arthematic obj=new Arthematic();
		obj.add(14,12);
		obj.add(14,12, 3);
	}

}
// method over riding will happen in the same class with same method name
