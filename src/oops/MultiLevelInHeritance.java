package oops;
class Animal1
{
	String animalName="dog";
	void eat()
	{
		System.out.println("animal is eating");
		
	}
}
class Dog1 extends Animal1
{
    void bark()
{
	System.out.println("dog is barking");
}
}
class Cat extends Dog1
{
	void meow()
	{
		System.out.println("meow");
	}
}

public class MultiLevelInHeritance {
	public static void main(String args[])
	{
		Cat obj=new Cat();
		obj.meow();
		obj.bark();
		obj.eat();
		System.out.println(obj.animalName);
	}

}
