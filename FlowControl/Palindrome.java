package FlowControl;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int rev=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		//System.out.println(rev);
		if(num==rev)
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}
		

	}

}
