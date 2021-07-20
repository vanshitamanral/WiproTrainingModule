package SetOfBoxes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class BoxDetails
{
	double length;
	double width;
	double height;
	BoxDetails(double l,double w,double h)
	{
		length=l;
		width=w;
		height=h;
	}
	
	double calVolume()
	{
		return length*width*height;
	}
}
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		HashMap<Double,BoxDetails> hm= new HashMap<>();
		System.out.println("Enter the number of boxes:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Length");
			double length=s.nextDouble();
			System.out.println("Enter Width");
			double width=s.nextDouble();
			System.out.println("Enter Height");
			double height=s.nextDouble();
			BoxDetails bd=new BoxDetails(length,width,height);
			hm.put(bd.calVolume(),bd);
		}
		for(Double d:hm.keySet())
		{
			System.out.println("Length = "+hm.get(d).length+" Width = "+hm.get(d).width+" Height = "+hm.get(d).height+" Volume = "+d);
		}
        
		
	}

}
