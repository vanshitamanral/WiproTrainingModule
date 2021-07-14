package OOPS;

import java.util.Scanner;

class Patient
{
	String name;
	double weight;
	double height;
	Patient(String n, double w, double h)
	{
		name=n;
		weight=w;
		height=h/100;
	}
	
	double BMI()
	{
		return (weight/(height*height));
	}
}

public class healthcare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String name=s.next();
		double weight=s.nextDouble();
		double height=s.nextDouble();
		Patient p=new Patient(name, weight, height);
		System.out.println(p.BMI());

	}

}
