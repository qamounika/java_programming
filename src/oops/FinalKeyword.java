package oops;
//we can not alter the value when we have the final key word
//final key word is used to restrict the user and also used along with classes,vairables and methos.

class Final
{
	void displaynum()
	{
		final int num=10;
		System.out.println(num);
		//num=20;
	}
}

public class FinalKeyword {
	public static void main(String args[])
	{
		Final obj=new Final();
		obj.displaynum();
	}

}
