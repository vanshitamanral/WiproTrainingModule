package ExceptionHAndling;

import java.util.Scanner;

public class DivisionOperation {
	public static void division(int a, int b) throws ArithmeticException
	{
		double result=a/b;
		System.out.println(result);
		System.out.println("Method ran successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		try {
			division(a,b);
		}catch(ArithmeticException e)
		{
			System.out.println("Caught inside main");
		}
		
	}

}
