package oops;

public class Public {
	public int a3=10;
	public void displayPublic()
	{
		System.out.println("displaying the value of a3 is-->"+a3);
	}
	public static void main(String args[])
	{
		Public pub=new Public();
		System.out.println(pub.a3);
		pub.displayPublic();
	}

}
