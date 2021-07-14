package OOPS;

public class box {

	double width;
	double height;
	double depth;
	box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	int volume()
	{
		return (int) (width*height*depth);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box b= new box(5.5,3.0,3.5);
		System.out.println(b.volume() );

	}

}
