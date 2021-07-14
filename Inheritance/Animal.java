package Inheritance;
class bird extends Animal{
	void eat()
	{
		System.out.println("Bird is eating");
	}
	
	void sleep()
	{
		System.out.println("Bird is Sleeping");
	}
	
	void fly()
	{
		System.out.println("Bird is Flying");
	}
}
public class Animal {
	
	void eat()
	{
		System.out.println("Animal is eating");
	}
	
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a= new Animal();
		a.eat();
		a.sleep();
		bird b= new bird();
		b.eat();
		b.sleep();
		b.fly();

	}

}
