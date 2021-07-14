package Inheritance;

class Apple extends Fruit
{
	Apple(String n, String t)
	{
		super(n,t);
	}
	
	void eat()
	{
		System.out.println(name);
		System.out.println(taste);
	}
}

class Orange extends Fruit
{
	Orange(String n, String t)
	{
		super(n,t);
	}
	
	void eat()
	{
		System.out.println(name);
		System.out.println(taste);
	}
}
public class Fruit {
	String name;
	String taste;
	int size;
	Fruit(String n, String t)
	{
		name=n;
		taste=t;
	}
	void eat()
	{
		System.out.println("eat method that has to be overriden");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit a= new Apple("Apple","Sweet");
		a.eat();
		Fruit o= new Orange("Orange","Sour");
		o.eat();
	}

}
