package oops;
class Animal2
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Cat2 extends Animal2
{
	void meow() {
		System.out.println("meow");
	}
}

public class HieraricalInheritance {
	public static void main(String args[])
	{
		Dog2 d = new Dog2();
		d.bark();
		d.eat();
		Cat2 c = new Cat2();
		c.meow();
		c.eat();
	}

}
