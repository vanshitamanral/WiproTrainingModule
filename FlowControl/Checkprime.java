package FlowControl;

import java.util.Scanner;

public class Checkprime {
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(isPrime(n));
		
		

	}

}
