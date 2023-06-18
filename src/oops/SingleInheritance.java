package oops;
class Animal
{
	String animalName="dog";
	void eat()
	{
	System.out.println("animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}


public class SingleInheritance {
	public static void main(String args[])
	{
		Dog d= new Dog();
		d.bark();
		d.eat();
		System.out.println(d.animalName);
	}
    
}
