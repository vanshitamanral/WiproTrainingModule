package Inheritance;

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class Shape {
	
	void draw()
	{
		System.out.println("Drawing shape");
	}
	
	void erase()
	{
		System.out.println("Erasing shape");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c= new Circle();
		Shape t=new Triangle();
		Shape s= new Square();
		c.draw();
		s.draw();
		t.draw();
		s.erase();
		c.erase();
		t.erase();

	}

}
