package basics;

public class StudentConstructor {

	int id;
	String name;
	StudentConstructor(int i,String n)
	{
		id=i;
		name=n;
	}
	public void display()
	{
		System.out.println("The id of the student is "+id+" and the name is" +name);
	}
	public static void main(String args[])
	{
	StudentConstructor s1= new StudentConstructor(98,"Mounika");
	s1.display();	
	
}
}
